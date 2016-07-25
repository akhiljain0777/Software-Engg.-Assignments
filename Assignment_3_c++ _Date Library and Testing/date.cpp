#include "date.h"
#include<bits/stdc++.h>
#include<iostream>
#include "TestDate.h"
#include<string>
#include<ctime>

using namespace std;

// //////// Checkers for date Format ////////////////
bool checkDateFormat(const char* dateFormat)
{
    if((strlen(dateFormat)==1 && (!strcmp(dateFormat,"0") || !strcmp(dateFormat,"d")))||(strlen(dateFormat)==2 && !strcmp(dateFormat,"dd")))return 1;
    else return 0;
}

bool checkMonthFormat(const char* monthFormat)
{

    if(strlen(monthFormat)==1 && (!strcmp(monthFormat,"0") || !strcmp(monthFormat,"m")))return 1;
    else if(strlen(monthFormat)==2 && !strcmp(monthFormat,"mm"))return 1;
    else if(strlen(monthFormat)==3 && !strcmp(monthFormat,"mmm"))return 1;
    else return 0;
}

bool checkYearFormat(const char* yearFormat)
{
    if(strlen(yearFormat)==1 && !strcmp(yearFormat,"0"))return 1;
    else if(strlen(yearFormat)==2 && !strcmp(yearFormat,"yy"))return 1;
    else if(strlen(yearFormat)==4 && !strcmp(yearFormat,"yyyy"))return 1;
    else return 0;
}
// ///////////////Checkers for date Format//////////////////////////////////


//  v Constructors  For date Format ///////////////////////
DateFormat::DateFormat(const char* dateF, const char* monthF, const char* yearF)
{
    /*If any of the dateF,month F or yearF is equal to 0, I assign corresponding dateFormat,monthFormar and yearFormat
    as string "0"   */
    dateFormat=new char[10];
    monthFormat=new char[10];
    yearFormat=new char[10];
    if(dateF!=0)strcpy(dateFormat,const_cast<char*>(dateF));
    else{
        dateFormat=new char[5];
        strcpy(dateFormat,"0");
    }
    if(monthF!=0)strcpy(monthFormat,const_cast<char*>(monthF));
    else{
        monthFormat=new char[5];
        strcpy(monthFormat,"0");
    }
    if(yearF!=0)strcpy(yearFormat,const_cast<char*>(yearF));
    else{
        yearFormat=new char[5];
        strcpy(yearFormat,"0");
    }

    if(!checkDateFormat(dateFormat))throw invalid_argument("Invalid Date Format");
    if(!checkMonthFormat(monthFormat))throw invalid_argument("Invalid Month Format");
    if(!checkYearFormat(yearFormat))throw invalid_argument("Invalid Year Format");
}

DateFormat::DateFormat(const char* format)
{
    /*(-mm-yyyy) Empty place at Date will treat it as same as 0 in the upper constructor  */
    int cnt=0,A[10],i;
    // Calculating No. of hyphens and their Locations ////////
    for(i=0;i<strlen(format);i++){
        if(format[i]=='-'){
            A[cnt++]=i;
        }
    }
    // Calculating No. of hyphens and their Locations ////////

    /* If hyphens not equal to 2,exception thrown */
    if(cnt!=2)throw invalid_argument("Wrong String Format");

    else{
        //geting Date Formats through the string //
        this->dateFormat=new char[5];
        this->monthFormat=new char[5];
        this->yearFormat=new char[5];
        dateFormat[A[0]]='\0';
        monthFormat[A[1]-A[0]-1]='\0';
        yearFormat[strlen(format)-A[1]-1]='\0';
        for(i=0;i<A[0];i++){
            dateFormat[i]=format[i];
        }
        for(i=0;i<A[1]-A[0]-1;i++){
            monthFormat[i]=format[A[0]+1+i];
        }
        for(i=0;i<strlen(format)-A[1]-1;i++){
            yearFormat[i]=format[A[1]+1+i];
        }

        // Checking For proper Format//
        if(!strcmp(dateFormat,""))strcpy(dateFormat,"0");
        if(!strcmp(monthFormat,""))strcpy(monthFormat,"0");
        if(!strcmp(yearFormat,""))strcpy(yearFormat,"0");

        if(!checkDateFormat(dateFormat))throw invalid_argument("Invalid Date Format");
        if(!checkMonthFormat(monthFormat))throw invalid_argument("Invalid Month Format");
        if(!checkYearFormat(yearFormat))throw invalid_argument("Invalid Year Format");
    }

}

DateFormat::DateFormat()    //default contructor
{
    dateFormat=new char[5];
    monthFormat=new char[5];
    yearFormat=new char[5];
    strcpy(this->dateFormat,"dd");
    strcpy(this->monthFormat,"mmm");
    strcpy(this->yearFormat,"yy");
}

// ^ Constructors For date Format ///////////////////////

DateFormat& DateFormat::operator=(const DateFormat& df)
/* Operator= Overloaded For DateFormat */
/* Defined By me */
{
    dateFormat=new char[5];
    monthFormat=new char[5];
    yearFormat=new char[5];
    strcpy(this->dateFormat,df.dateFormat);
    strcpy(this->monthFormat,df.monthFormat);
    strcpy(this->yearFormat,df.yearFormat);
}

char* DateFormat::getDateFormat(){return dateFormat;}
char* DateFormat::getMonthFormat(){return monthFormat;}
char* DateFormat::getYearFormat(){return yearFormat;}

DateFormat::~DateFormat(){} //DateFormat Destructor


void Date::checkDate(Day d,Month m,Year y)
// Checking whether the date given is in proper format or not and throwing exceptions
{

    if(m>12|| m<1 || d>31 || d<1){
        throw (invalid_argument("Day must be <=31 and >=1 and Month must be <=12 and >=1"));
    }
    unsigned int cnt=0,tmp;
    tmp=y;
    while(tmp!=0){
        cnt++;
        tmp=tmp/10;
    }

    if(!(cnt==2||cnt==4)){
        throw(invalid_argument("Invalid Year Format"));
    }
    if(d>30 && (m==4 || m==6 ||m==9 || m==11))throw domain_error("Day must be <=30 for this month");
    if(m==2 && leapYear()){
        if(d>29)throw domain_error("Leap Year, so days must be <=29 for february month");
    }
    if(m==2 && !leapYear()){
        if(d>28)throw domain_error("Not a leap year,so days must be <=28 for february month");
    }
    if(!((y>=1950 && y<=2049)||(y>=0 && y<=99)))throw out_of_range("Year must be <=2049 and >=1950");
}

/////////////// Constructors for date ///////////////////////////

Date::Date(Day d,Month m,Year y)throw(invalid_argument,domain_error,out_of_range)
{
    /* I am also accepting 15 as a valid year and will convert it to proper year, for eg 2015*/
    this->d=static_cast<Day>(d);
    this->m=static_cast<Month>(m);
    this->y=y;
    if(y>=0 && y<=49)this->y=y+2000;
    else if(y>=50  && y<=99)this->y=y+1900;
    checkDate(d,m,y); //checking date

}

Date::Date(const char* dated)throw(invalid_argument, domain_error, out_of_range) //Explicit Constructor
{
    //  date in string format -- to be parsed as static format member
    if(!strcmp(getFormat().getDateFormat(),"0")){
        throw invalid_argument("This type of Date format is for output only");
    }
    if(!strcmp(getFormat().getMonthFormat(),"mmm")  || !strcmp(getFormat().getMonthFormat(),"0") ){
        throw invalid_argument("This type of Month format is for output only");
    }
    if(!strcmp(getFormat().getYearFormat(),"0")){
        throw invalid_argument("This type of Year format is for output only");
    }
    int i,A[10],cnt=0,flag=0;
    char *D,*M,*Y;
    D=new char[5];
    M=new char[5];
    Y=new char[5];

    //counting no. of hyphens and their location
    for(i=0;i<strlen(dated);i++){
        if(dated[i]=='-')A[cnt++]=i;
    }
    ////////////////
    if(cnt!=2)throw invalid_argument("Invalid Input String");
    else{
        // Getting Day, month and year through string and setting them in D,M,Y strings.
        if(strlen(getFormat().getDateFormat())==A[0]){
            flag++;
            D[A[0]]='\0';
            for(i=0;i<A[0];i++){
                D[i]=dated[i];
            }
        }
        else if(!strcmp(getFormat().getDateFormat(),"d") && ((A[0]==1 || A[0]==2) && dated[0]!='0')){
            flag++;
            D[A[0]]='\0';
            for(i=0;i<A[0];i++){
                D[i]=dated[i];
            }
        }
        else throw invalid_argument("Invalid Date Format");

        if(strlen(getFormat().getMonthFormat())==A[1]-A[0]-1 ){
            flag++;
            M[A[1]-A[0]-1]='\0';
            for(i=0;i<A[1]-A[0]-1;i++){
                M[i]=dated[A[0]+1+i];
            }
        }
        else if(!strcmp(getFormat().getMonthFormat(),"m") && ((A[1]-A[0]-1==2 || A[1]-A[0]-1==1 ) && dated[A[0]+1]!='0')){
            flag++;
            M[A[1]-A[0]-1]='\0';
            for(i=0;i<A[1]-A[0]-1;i++){
                M[i]=dated[A[0]+1+i];
            }
        }
        else throw invalid_argument("Invalid Month Format");

        if(strlen(getFormat().getYearFormat())==strlen(dated)-A[1]-1){
            flag++;
            Y[strlen(dated)-A[1]-1]='\0';
            for(i=0;i<strlen(dated)-A[1]-1;i++){
            Y[i]=dated[A[1]+1+i];
            }
        }
        else throw invalid_argument("Invalid Year Format");

        if(flag==3){
            this->d=static_cast<Day>(atoi(D)); //Using atoi to get integer value from string
            this->m=static_cast<Month>(atoi(M));
            this->y=atoi(Y);
            if(this->y>=0 && this->y<=49)this->y=this->y+2000;
            else if(this->y>=50  && this->y<=99)this->y=this->y+1900;
            checkDate(d,m,y);
        }
    }
}

Date::Date()throw(domain_error, out_of_range) //default constructor
{
    char dd[10],mm[10],yyyy[10];
    time_t t = time(0);
    strftime(dd, 10, "%d", localtime(&t)); // using strftime to extract date as dd,mm,yyyy String
    strftime(mm, 10, "%m", localtime(&t));
    strftime(yyyy, 10, "%Y", localtime(&t));
    this->d=static_cast<Day>(atoi(dd));
    this->m=static_cast<Month>(atoi(mm));
    this->y=atoi(yyyy);
    if(d>30 && (m==4 || m==6 ||m==9 || m==11))throw domain_error("Day must be <=30 for this month");
    if(m==2 && leapYear()){
        if(d>29)throw domain_error("Leap Year, so days must be <=29 for february month");
    }
    if(m==2 && !leapYear()){
        if(d>28)throw domain_error("Not a leap year,so days must be <=28 for february month");
    }
    if(!((y>=1950 && y<=2049)||(y>=0 && y<=99)))throw out_of_range("Year must be <=2049 and >=1950");
}

///////////////////////////////////////////////////////////////////////////////////////////////

Date::Date(const Date & c) //copy constructor
{

    this->d=c.d;
    this->m=c.m;
    this->y=c.y;
}

Date::~Date(){} // Destructors

Day Date::getDate()const{return d;} //getters for date
Month Date::getMonth()const{return m;}
Year Date::getYear()const{return y;}

Date& Date::operator=(const Date& dt) //operator= overloaded
{
    this->d=dt.d;
    this->m=dt.m;
    this->y=dt.y;
    return *this;
}

Date& Date::operator++()
{
    // used library to get operator++
    tm t = {};
    t.tm_year = static_cast<unsigned int>(this->y)-1900;
    t.tm_mon  = static_cast<unsigned int>(m)-1;
    t.tm_mday = static_cast<unsigned int>(d);
    t.tm_mday += 1;
    mktime(&t);
    this->y=static_cast<Year>(1900+t.tm_year);
    this->m=static_cast<Month>(t.tm_mon+1);
    this->d=static_cast<Day>(t.tm_mday);
    if(this->y>2049){
        throw out_of_range("Year must be <=2049");
    }
    else return *this;
}

Date Date::operator++(int)
{
    Date temp;
    temp=*this;
    std::tm t = {};
    t.tm_year = static_cast<unsigned int>(this->y)-1900;
    t.tm_mon  = static_cast<unsigned int>(m)-1;
    t.tm_mday = static_cast<unsigned int>(d);
    t.tm_mday += 7;
    std::mktime(&t);
    this->y=static_cast<Year>(1900+t.tm_year);
    this->m=static_cast<Month>(t.tm_mon+1);
    this->d=static_cast<Day>(t.tm_mday);
    if(this->y>2049){
        throw out_of_range("Year must be <=2049");
    }
    else return temp;
}

Date& Date::operator--()
{
    std::tm t = {};
    t.tm_year = static_cast<unsigned int>(this->y)-1900;
    t.tm_mon  = static_cast<unsigned int>(m)-1;
    t.tm_mday = static_cast<unsigned>(d);
    t.tm_mday -=1;
    std::mktime(&t);
    this->y=static_cast<Year>(1900+t.tm_year);
    this->m=static_cast<Month>(t.tm_mon+1);
    this->d=static_cast<Day>(t.tm_mday);
    if(this->y<1950){
        throw out_of_range("Year must be >=1950");
    }
    else return *this;
}

Date Date::operator--(int)
{
    Date temp;
    temp=*this;
    std::tm t = {};
    t.tm_year = static_cast<unsigned int>(this->y)-1900;
    t.tm_mon  = static_cast<unsigned int>(m)-1;
    t.tm_mday = static_cast<unsigned int>(d);
    t.tm_mday -= 7;
    std::mktime(&t);
    this->y=static_cast<Year>(1900+t.tm_year);
    this->m=static_cast<Month>(t.tm_mon+1);
    this->d=static_cast<Day>(t.tm_mday);
    if(this->y<1950){
        throw out_of_range("Year must be >=1950");
    }
    else return temp;
}

unsigned int Date::operator-(const Date& otherDate)
{
    int i;
    unsigned int diff;
    long long int d1,d2;
    int days_in_month[]={31,28,31,30,31,30,31,31,30,31,30,31};

    d1=365*(this->y)+this->d;
    for(i=0;i<this->m-1;i++){
        d1+=days_in_month[i];
    }
    if(m<=2){
        d1+=(this->y-1)/4-(this->y-1)/100+(this->y-1)/400;
    }
    else{
        d1+=(this->y)/4-(this->y)/100+(this->y)/400;
    }

    d2=365*(otherDate.y)+otherDate.d;
    for(i=0;i<otherDate.m-1;i++){
        d2+=days_in_month[i];
    }
    if(m<=2){
        d2+=(otherDate.y-1)/4-(otherDate.y-1)/100+(otherDate.y-1)/400;
    }
    else{
        d2+=(otherDate.y)/4-(otherDate.y)/100+(otherDate.y)/400;
    }

    if(d1>=d2)diff=d1-d2;
    else diff=d2-d1;

    return diff;
}

Date Date::operator+(int noOfDays)throw(domain_error, out_of_range)
{
    Date tmp;
    std::tm t = {};
    t.tm_year = static_cast<unsigned int>(this->y)-1900;
    t.tm_mon  = static_cast<unsigned int>(m)-1;
    t.tm_mday = static_cast<unsigned int>(d);
    t.tm_mday += noOfDays;
    std::mktime(&t);
    tmp.y=static_cast<Year>(1900+t.tm_year);
    tmp.m=static_cast<Month>(t.tm_mon+1);
    tmp.d=static_cast<Day>(t.tm_mday);
    if(tmp.y<1950 || tmp.y>2049){
        throw out_of_range("Year must be >=1950 and <=2049");
    }
    else return tmp;
}

Date Getweek1(unsigned int year)
{
    Date dt(static_cast<Day>(4),static_cast<Month>(1),year);
    dt=(dt+(1-(WeekDay)dt));
    return dt;

}

Date::operator WeekNumber() const
{
   int d1,day,year;
   Date week1;
   year =static_cast<unsigned int>(this->y);
   Date tmp(static_cast<Day>(29),static_cast<Month>(12),year);
   if(tmp<=*this){
        week1=Getweek1(year+1);
        if(week1 > *this){
            week1=Getweek1(year);
        }
        else year++;
   }

   else{
        week1=Getweek1(year);
        if (week1 > *this) {
            week1 = Getweek1(--year);
        }
   }
   int i=week1==*this ? 0:1;
   return static_cast<WeekNumber>((((week1-*this)-i)/7)+1);
}

Date::operator Month()const
{
    return this->m;
}

Date::operator WeekDay()const
{
    int year;
    int tmp[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
    if(this->m<3)year=this->y-1;
    else year=this->y;
    if((year+year/4-year/100+year/400+tmp[this->m-1]+this->d)%7==0)return static_cast<WeekDay>(7);
    return static_cast<WeekDay>((year+year/4-year/100+year/400+tmp[this->m-1]+d)%7);
}


bool Date::leapYear()const
{
    //As our year range is in between 1950 and 2049 only so directly y%4 will work
    if(y%4==0)return 1;
    else return 0;
}


bool Date::operator==(const Date& otherDate)
{
    if(!(*this-otherDate))return 1;
    else return 0;
}

bool Date::operator!=(const Date& otherDate)
{
    if((*this-otherDate))return 1;
    else return 0;
}

bool Date::operator<(const Date& otherDate)
{
    if(this->y > otherDate.y)return 0;
    else if(this->y < otherDate.y)return 1;

    if(this->m > otherDate.m)return 0;
    else if(this->m < otherDate.m)return 1;

    if(this->d > otherDate.d)return 0;
    else if(this->d < otherDate.d)return 1;

    return 0;
}

bool Date::operator<=(const Date& otherDate)
{
    if(*this<otherDate || *this==otherDate)return 1;
    else return 0;
}

bool Date::operator>(const Date& otherDate)
{
    if(this->y > otherDate.y)return 1;
    else if(this->y < otherDate.y)return 0;

    if(this->m > otherDate.m)return 1;
    else if(this->m < otherDate.m)return 0;

    if(this->d > otherDate.d)return 1;
    else if(this->d < otherDate.d)return 0;

    return 0;
}

bool Date::operator>=(const Date& otherDate)
{
    if(*this>otherDate || *this==otherDate)return 1;
    else return 0;
}

istream& operator>>(istream& is, Date& dt)
{
    char tmp[50];
    is>>tmp; //taking string as input and calling explicit constructor
    Date D1(tmp);
    dt=D1;
    return is;
}

ostream& operator<<(ostream& os, const Date& dt)
{
    if(!strcmp(Date::format.getDateFormat(),"0")){
        os<<"*";
    }
    if(!strcmp(Date::format.getDateFormat(),"d")){
        os<<dt.d;
    }
    if(!strcmp(Date::format.getDateFormat(),"dd")){
       if(dt.d>=10)os<<dt.d;
       else os<<"0"<<dt.d;
    }
    if(!strcmp(Date::format.getMonthFormat(),"0")){
        if(dt.m==1)os<<"-January";
        if(dt.m==2)os<<"-February";
        if(dt.m==3)os<<"-March";
        if(dt.m==4)os<<"-April";
        if(dt.m==5)os<<"-May";
        if(dt.m==6)os<<"-June";
        if(dt.m==7)os<<"-July";
        if(dt.m==8)os<<"-August";
        if(dt.m==9)os<<"-September";
        if(dt.m==10)os<<"-October";
        if(dt.m==11)os<<"-November";
        if(dt.m==12)os<<"-December";
    }
    if(!strcmp(Date::format.getMonthFormat(),"m")){
        os<<"-"<<dt.m;
    }
    if(!strcmp(Date::format.getMonthFormat(),"mm")){
        if(dt.m>=10)os<<"-"<<dt.m;
        else os<<"-0"<<dt.m;
    }
    if(!strcmp(Date::format.getMonthFormat(),"mmm")){
        if(dt.m==1)os<<"-Jan";
        if(dt.m==2)os<<"-Feb";
        if(dt.m==3)os<<"-Mar";
        if(dt.m==4)os<<"-Apr";
        if(dt.m==5)os<<"-May";
        if(dt.m==6)os<<"-Jun";
        if(dt.m==7)os<<"-Jul";
        if(dt.m==8)os<<"-Aug";
        if(dt.m==9)os<<"-Sep";
        if(dt.m==10)os<<"-Oct";
        if(dt.m==11)os<<"-Nov";
        if(dt.m==12)os<<"-Dec";
    }
    if(!strcmp(Date::format.getYearFormat(),"0")){
        os<<"-*";
    }
    if(!strcmp(Date::format.getYearFormat(),"yy")){
        if((dt.y%100)>=10)os<<"-"<<(dt.y%100);
        else os<<"-0"<<(dt.y%100);
    }
    if(!strcmp(Date::format.getYearFormat(),"yyyy")){
        os<<"-"<<(dt.y);
    }
    return os;
}



DateFormat Date::format;

DateFormat& Date::getFormat()
{
    return Date::format;
}

void Date::setFormat(DateFormat& df)
{
    Date::format=df;
}



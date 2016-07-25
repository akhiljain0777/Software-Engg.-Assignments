#include "TestDate.h"
#include "date.h"
#include<cstring>

using namespace std;

void TestDate::testDateFormatConstructor()
{

    cout<<"---Testing Date Format---"<<endl<<endl;
    cout<<"---Testing DateFormat(const char*,const char*,const char*) Constructor---"<<endl;

    int i,j,k;
    const char* dayF[]={0,"d","dd","ddd","dddd","ab","cd1"};
    const char* monthF[]={0,"m","mm","mmm","mmmm","dd","ab","98"};
    const char* yearF[]={0,"y","yy","yyy","yyyy","dddd","abd"};
    const char* hyphen[]={"-"};
    for(i=0;i<6;i++){
        for(j=0;j<8;j++){
            for(k=0;k<7;k++){
                try{
                    cout<<"Input( ";
                    if(dayF[i]!=0)cout<<dayF[i]<<"-";
                    else cout<<"0-";
                    if(monthF[j]!=0)cout<<monthF[j]<<"-";
                    else cout<<"0"<<"-";
                    if(yearF[k]!=0)cout<<yearF[k]<<") ";
                    else cout<<"0"<<") ";
                    DateFormat test(dayF[i],monthF[j],yearF[k]);
                    cout<<"Date Format Stored ";
                    cout<<test.getDateFormat()<<"-"<<test.getMonthFormat()<<"-"<<test.getYearFormat();
                    cout<<endl;
                }
                catch(const std::invalid_argument& ia){
                    cout<<"Invalid Argument: "<<ia.what()<<endl;
                }
                catch(const std::domain_error& de){
                    cout<<"Domain Error: "<<de.what()<<endl;
                }
                catch(const std::out_of_range& oor){
                    cout<<"Out of Range: "<<oor.what()<<endl;

                }

            }
        }
    }

   cout<<endl<<endl<<"---Testing DateFormat(const char*) Constructor---"<<endl;

    for(i=0;i<6;i++){
        for(j=0;j<8;j++){
            for(k=0;k<7;k++){
                try{
                    char result[100];
                    cout<<"Input( ";
                    if(dayF[i]!=0){
                        cout<<dayF[i]<<"-";
                        strcpy(result,dayF[i]);
                    }
                    else {
                        cout<<"-";
                        strcpy(result,"");
                    }
                    if(monthF[j]!=0){
                        cout<<monthF[j]<<"-";
                        strcat(result,"-");
                        strcat(result,monthF[j]);
                    }
                    else {
                        cout<<"-";
                        strcat(result,"-0");
                    }
                    if(yearF[k]!=0){
                        cout<<yearF[k]<<") ";
                        strcat(result,"-");
                        strcat(result,yearF[k]);
                    }
                    else {
                        cout<<""<<") ";
                        strcat(result,"-");
                    }
                    DateFormat test(result);
                    cout<<"Date Format Stored ";
                    cout<<test.getDateFormat()<<"-"<<test.getMonthFormat()<<"-"<<test.getYearFormat();
                    cout<<endl;
                }
                catch(const std::invalid_argument& ia){
                    cout<<"Invalid Argument: "<<ia.what()<<endl;
                }
                catch(const std::domain_error& de){
                    cout<<"Domain Error: "<<de.what()<<endl;
                }
                catch(const std::out_of_range& oor){
                    cout<<"Out of Range: "<<oor.what()<<endl;

                }

            }
        }
    }


    cout<<endl<<endl<<"Testing Default Date Constructor"<<endl;
    DateFormat t3;
    cout<<t3.getDateFormat()<<"-";
    cout<<t3.getMonthFormat()<<"-";
    cout<<t3.getYearFormat()<<endl;
}

void TestDate::testDateConstructor()
{
    DateFormat ddmmmyy;
    Date::setFormat(ddmmmyy);
    int i,j,k,l;
    Day day[]={D01,D08,D13,D28,D29,D30,D31,static_cast<Day>(33)};
    Month month[]={Jan,Feb,Apr,Jul,Aug,Dec,static_cast<Month>(13)};
    Year year[]={15,1996,2003,1950,1949,2050,2051,2055,1955,49,103,130};
    cout<<endl<<endl<<"---Testing Date---"<<endl<<endl;
    cout<<"---Testing Date(Day,Month,Year) Constructor---"<<endl;
    for(i=0;i<8;i++){
        for(j=0;j<7;j++){
            for(k=0;k<12;k++){
                try{
                    cout<<"Input ( "<<day[i]<<"-"<<month[j]<<"-"<<year[k]<<") ";
                    Date testdt(day[i],month[j],year[k]);
                    cout<<"Date Stored "<<testdt<<endl;
                }
                catch(const std::invalid_argument& ia){
                    cout<<"Invalid Argument: "<<ia.what()<<endl;
                }
                catch(const std::domain_error& de){
                    cout<<"Domain Error: "<<de.what()<<endl;
                }
                catch(const std::out_of_range& oor){
                    cout<<"Out of Range: "<<oor.what()<<endl;
                }
            }
        }
    }
    cout<<endl<<endl<<"---Testing explicit Date(const char*) Constructor---"<<endl;

    DateFormat testformat[50];
    const char* dayF[]={0,"d","dd"};
    const char* monthF[]={0,"m","mm","mmm"};
    const char* yearF[]={0,"yy","yyyy"};
    const char* day_st[]={"1","8","03","07","13","28","29","30","31","33"};
    const char* month_st[]={"1","2","03","4","7","08","8","12","13"};
    const char* year_st[]={"15","1996","03","1950","1949","50","2051","2055","1955","49","103","00","130"};
    l=0;
    for(i=0;i<3;i++){
        for(j=0;j<4;j++){
            for(k=0;k<3;k++){
                testformat[l++]=DateFormat(dayF[i],monthF[j],yearF[k]);
            }
        }
    }
    for(l=0;l<36;l++){
        for(i=0;i<10;i++){
        for(j=0;j<9;j++){
            for(k=0;k<13;k++){
                    try{
                        char result[50];
                        Date::setFormat(testformat[l]);
                        cout<<"Input ( "<<day_st[i]<<"-"<<month_st[j]<<"-"<<year_st[k]<<") ";
                        cout<<"Format("<<(Date::getFormat().getDateFormat())<<"-";
                        cout<<(Date::getFormat().getMonthFormat())<<"-";
                        cout<<(Date::getFormat().getYearFormat())<<") " ;
                        strcpy(result,day_st[i]);
                        strcat(result,"-");
                        strcat(result,month_st[j]);
                        strcat(result,"-");
                        strcat(result,year_st[k]);
                        Date testdt2(result);
                        cout<<"Date Stored "<<testdt2;
                        cout<<endl;
                    }
                    catch(const std::invalid_argument& ia){
                        cout<<"Invalid Argument: "<<ia.what()<<endl;
                    }
                    catch(const std::domain_error& de){
                       cout<<"Domain Error: "<<de.what()<<endl;
                    }
                    catch(const std::out_of_range& oor){
                        cout<<"Out of Range: "<<oor.what()<<endl;
                    }
                }
            }
        }
    }
    cout<<endl<<endl<<"---Testing Default Date Constructor---"<<endl;
    Date testdt3;
    cout<<testdt3<<endl;
}

void TestDate::testoperatorEqualTo()
{
    cout<<endl<<endl<<"---Testing Copy Constructor and Operator=---"<<endl;
    Day day[]={D01,D02,D29,D28,D30,D31};
    Month month[]={Jan,Feb,Apr,Jul,Aug,Dec};
    Year year[]={2015,2016,1980,1996,2043};
    int i,j,k;

    for(i=0;i<6;i++){
        for(j=0;j<6;j++){
            for(k=0;k<5;k++){
                try{
                    Date B,C;
                    Date D;
                    Date A(day[i],month[j],year[k]);
                    C=(D=A);
                    cout<<"A="<<A<<endl;
                    cout<<"C="<<C<<endl;
                    cout<<"D="<<D<<endl;
                    cout<<endl;
                }
                catch(const std::invalid_argument& ia){
                    //cout<<"Invalid Argument: "<<ia.what()<<endl;
                }
                catch(const std::domain_error& de){
                    //cout<<"Domain Error: "<<de.what()<<endl;
                }
                catch(const std::out_of_range& oor){
                    //cout<<"Out of Range: "<<oor.what()<<endl;

                }


            }
        }
    }
}


void TestDate::testOperatorPostFix()
{
    cout<<endl<<endl<<"---Testing Operator++(int)"<<endl;
    Day day[]={D01,D02,D29,D28,D30,D31};
    Month month[]={Jan,Feb,Apr,Jul,Aug,Dec};
    Year year[]={1950,1996,2015,2016,2049};
    int i,j,k;

    for(i=0;i<6;i++){
        for(j=0;j<6;j++){
            for(k=0;k<5;k++){
                try{
                    Date A(day[i],month[j],year[k]);
                    cout<<"Previous Date: "<<A<<endl;
                    A++;
                    cout<<"Current Date: "<<A<<endl;
                    cout<<endl;
                }
                catch(const std::invalid_argument& ia){
                    //cout<<"Invalid Argument: "<<ia.what()<<endl;
                }
                catch(const std::domain_error& de){
                    //cout<<"Domain Error: "<<de.what()<<endl;
                }
                catch(const std::out_of_range& oor){
                    cout<<"Out of Range: "<<oor.what()<<endl<<endl;

                }


            }
        }
    }
}

void TestDate::testOperatorPreFix()
{
    cout<<endl<<endl<<"---Testing Operator++(int)"<<endl;
    Day day[]={D01,D02,D29,D28,D30,D31};
    Month month[]={Jan,Feb,Apr,Jul,Aug,Dec};
    Year year[]={1950,1996,2015,2016,2049};
    int i,j,k;

    for(i=0;i<6;i++){
        for(j=0;j<6;j++){
            for(k=0;k<5;k++){
                try{
                    Date A(day[i],month[j],year[k]);
                    cout<<"Previous Date: "<<A<<endl;
                    ++A;
                    cout<<"Current Date: "<<A;
                    cout<<endl<<endl;
                }
                catch(const std::invalid_argument& ia){
                    //cout<<"Invalid Argument: "<<ia.what()<<endl;
                }
                catch(const std::domain_error& de){
                    //cout<<"Domain Error: "<<de.what()<<endl;
                }
                catch(const std::out_of_range& oor){
                    cout<<"Out of Range: "<<oor.what()<<endl<<endl;

                }


            }
        }
    }
}


void TestDate::testOperatorDecriment()
{
    cout<<endl<<endl<<"---Testing Operator--(int)"<<endl;
    Day day[]={D01,D02,D29,D28,D30,D31};
    Month month[]={Jan,Feb,Apr,Jul,Aug,Dec};
    Year year[]={1950,1980,1996,2016,2049};
    int i,j,k;

    for(i=0;i<6;i++){
        for(j=0;j<6;j++){
            for(k=0;k<5;k++){
                try{
                    Date A(day[i],month[j],year[k]);
                    cout<<"Previous Date:(Testing A--) "<<A<<endl;
                    A--;
                    cout<<"Current Date: "<<A<<endl;
                    cout<<endl;
                }
                catch(const std::invalid_argument& ia){
                    //cout<<"Invalid Argument: "<<ia.what()<<endl;
                }
                catch(const std::domain_error& de){
                    //cout<<"Domain Error: "<<de.what()<<endl;
                }
                catch(const std::out_of_range& oor){
                    cout<<"Out of Range: "<<oor.what()<<endl<<endl;

                }


            }
        }
    }


    cout<<endl<<endl<<"---Testing Operator--()"<<endl;

    for(i=0;i<6;i++){
        for(j=0;j<6;j++){
            for(k=0;k<5;k++){
                try{
                    Date A(day[i],month[j],year[k]);
                    cout<<"Previous Date: "<<A<<endl;
                    --A;
                    cout<<"Current Date(--A): "<<A;
                    cout<<endl<<endl;
                }
                catch(const std::invalid_argument& ia){
                    //cout<<"Invalid Argument: "<<ia.what()<<endl;
                }
                catch(const std::domain_error& de){
                    //cout<<"Domain Error: "<<de.what()<<endl;
                }
                catch(const std::out_of_range& oor){
                    cout<<"Out of Range: "<<oor.what()<<endl<<endl;

                }


            }
        }
    }
}


void TestDate::testOperatoraddition()
{
    int test[]={-598,-365,-30,-18,-5,-1,1,10,30,365,598};
    Day days[]={D12,D28};
    Month months[]={Feb,Aug,Dec};
    Year  years[]={1950,2015,2016,2049};
    int i,j,k,l;
    Date testdt4,testdt5;
    cout<<endl<<endl<<"---Testing Operator Addition---"<<endl<<endl;
    for(l=0;l<11;l++){
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                for(k=0;k<4;k++){
                    try{
                        cout<<"Current Date: ";
                        testdt4=Date(days[i],months[j],years[k]);
                        cout<<testdt4<<endl;
                        cout<<"New Date ( Current Date +("<<test[l]<<")): ";
                        testdt5=testdt4+test[l];
                        cout<<"New Date ( Current Date +("<<test[l]<<")): ";
                        cout<<testdt5;
                        cout<<endl<<endl;
                    }
                    catch(const std::invalid_argument& ia){
                        cout<<"Invalid Argument: "<<ia.what()<<endl<<endl;
                    }
                    catch(const std::domain_error& de){
                        cout<<"Domain Error: "<<de.what()<<endl<<endl;
                    }
                    catch(const std::out_of_range& oor){
                        cout<<"Out of Range: "<<oor.what()<<endl<<endl;

                    }
                }
            }
        }
    }


}

void TestDate::testOperatorOther()
{
    int i,j,k,cnt=0;
    Date testdt[100];
    Date A,B;
    Day days[]={D01,D13,D27,D28};
    Month months[]={Jan,Feb,Aug,Dec};
    Year years[]={1951,2013,2016,2049};
    for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            for(k=0;k<4;k++){
                 testdt[cnt++]=Date(days[i],months[j],years[k]);
            }
        }
    }
    cout<<endl<<endl<<"---Testing Other Operators such as -,>,>=,Weekday,Month,Weeknumber etc."<<endl<<endl;
    for(i=0;i<cnt;i++){
        for(j=0;j<cnt;j++){
            A=testdt[i];
            B=testdt[j];
            cout<<"A="<<A<<endl;
            cout<<"WeekNumber of A="<<(WeekNumber)A<<endl;
            cout<<"Month of A="<<(Month)A<<endl;
            cout<<"WeekDay of A="<<(WeekDay)A<<endl;
            cout<<"B="<<B<<endl;
            cout<<"WeekNumber of B="<<(WeekNumber)B<<endl;
            cout<<"Month of B="<<(Month)B<<endl;
            cout<<"WeekDay of B="<<(WeekDay)B<<endl;
            cout<<"(A-B)="<<(A-B)<<endl;
            if(A==B)cout<<"A==B"<<endl;
            if(A>=B)cout<<"A>=B"<<endl;
            if(A>B)cout<<"A>B"<<endl;
            if(A<=B)cout<<"A<=B"<<endl;
            if(A<B)cout<<"A<B"<<endl;
            cout<<endl;
        }
    }


}

void TestDate::testLeapYear()
{
    cout<<endl<<"---Testing Leap Year---"<<endl<<endl;
    unsigned int i;
    Day day=D17;
    Month month=Mar;
    for(i=1950;i<=2049;i++){
        Date d1(day,month,i);
        cout<<"Year "<<i;
        if(d1.leapYear())cout<<": Leap Year"<<endl;
        else cout<<": Not a Leap Year"<<endl;
    }

}

void TestDate::testOstream()
{
    int i,j,k,cnt=0;
    Date d1;
    const char* dayF[]={0,"d","dd"};
    const char* monthF[]={0,"m","mm","mmm"};
    const char* yearF[]={0,"yy","yyyy"};
    cout<<endl<<endl<<"---Testing Ostream---"<<endl<<endl;
    DateFormat df[50];
    for(i=0;i<3;i++){
        for(j=0;j<4;j++){
            for(k=0;k<3;k++){
                df[cnt++]=DateFormat(dayF[i],monthF[j],yearF[k]);
            }
        }
    }
    for(i=0;i<cnt;i++){
        Date::setFormat(df[i]);
        cout<<(Date::getFormat().getDateFormat())<<"-";
        cout<<(Date::getFormat().getMonthFormat())<<"-";
        cout<<(Date::getFormat().getYearFormat())<<endl;
        cout<<d1<<endl<<endl;
    }

}

void TestDate::testMiscellaneous()
{
    Date A,B,C;
    cout<<"A="<<A<<endl;
    B=A--;
    cout<<"B=A--="<<B<<endl;
    cout<<"A="<<A<<endl;
    C=--A;
    cout<<"C=--A="<<C<<endl;
    cout<<"A="<<A<<endl;
    B=A++;
    cout<<"B=A++="<<B<<endl;
    cout<<"A="<<A<<endl;
    C=++A;
    cout<<"C=++A="<<C<<endl;
    cout<<"A="<<A<<endl;
}


void TestDate::test()
{
     testDateFormatConstructor();
     testDateConstructor();
     testoperatorEqualTo();
     testOperatorPostFix();
     testOperatorPreFix();
     testOperatorDecriment();
     testOperatoraddition();
     testOperatorOther();
     testLeapYear();
     testOstream();
     testMiscellaneous();

}

int main()
{
    TestDate::test();
}

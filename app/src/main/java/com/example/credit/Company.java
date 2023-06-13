package com.example.credit;

public class Company {
    private String name;
    private double roa, roe, roie, profit_margin, profit_margin2, ropm, dar, cr,qr,ocfr;
    public Company(String name){ this.name =name;}

    public Company(){}
    public Company(String name,double roa, double roe, double roie, double profit_margin, double profit_margin2, double ropm, double dar, double cr,double qr,double ocfr)
    {
        this.name=name;
        this.roa=roa;
        this.roe=roe;
        this.roie=roie;
        this.profit_margin=profit_margin;
        this.profit_margin2=profit_margin2;
        this.ropm=ropm;
        this.dar=dar;
        this.cr=cr;
        this.qr=qr;
        this.ocfr=ocfr;
    }




}

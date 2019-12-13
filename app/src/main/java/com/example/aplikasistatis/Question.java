package com.example.aplikasistatis;

public class Question {

    private String cQuestion[] = {
            "Siapa nama kamu ? ",
            "Dimana kamu tinggal ? ",
            "Tadi malam kamu ngapain aja ? ",
            "Siapa nama ayah kamu ? "

    };

    private String cChoise[][] = {
            {"Joe", "sandi", "Ari", "Riyadi"},
            {"Jono", "Kajangan", "Nguncaran", "Bojoengoro"},
            {"Gaming", "Mandi", "Makan", "Tidur"},
            {"Tamyis", "Sakri", "Nigut", "Yuslan"},
    };

    private String cAnswer[] = {
            "Joe",
            "Kajangan",
            "Tidur",
            "Tamyis"
    };

    public String getQuestion(int nomor){
        String tanya = cQuestion[nomor];
        return tanya;
    }
    public String getAnswer(int nomor){
        String jawab = cAnswer[nomor];
        return jawab;
    }

    public String getChoice1(int nomor){
        String pilih = cChoise[nomor][0];
        return pilih;
    }
    public String getChoice2(int nomor){
        String pilih = cChoise[nomor][1];
        return pilih;
    }
    public String getChoice3(int nomor){
        String pilih = cChoise[nomor][2];
        return pilih;
    }
    public String getChoice4(int nomor){
        String pilih = cChoise[nomor][3];
        return pilih;
    }

}

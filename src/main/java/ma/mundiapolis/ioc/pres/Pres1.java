package ma.mundiapolis.ioc.pres;

import ma.mundiapolis.ioc.dao.DaoImpl2;
import ma.mundiapolis.ioc.dao.IDao;
import ma.mundiapolis.ioc.metier.IMetier;
import ma.mundiapolis.ioc.metier.MetierImpl;

import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Pres1 {
    public static void main(String[] args) throws Exception {
        DaoImpl2 d = new DaoImpl2();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("RES"+metier.calcul());
}}

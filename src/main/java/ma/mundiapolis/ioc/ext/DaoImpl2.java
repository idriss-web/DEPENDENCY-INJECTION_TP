package ma.mundiapolis.ioc.dao;

import org.springframework.stereotype.Component;

@Component("d2")

public class DaoImpl2 implements IDao {

    @Override
    public double getData() {
        System.out.print("En utilisant le WB ( Web Service ) comme source de données...");

        return 10.0;
    }
}

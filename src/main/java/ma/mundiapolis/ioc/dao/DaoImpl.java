package ma.mundiapolis.ioc.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.print("En utilisant la base de donnée comme source de données...");

        return 10.0;
    }
}

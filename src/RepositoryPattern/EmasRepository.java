package RepositoryPattern;

import java.util.List;

public interface EmasRepository {

    void savePembelian(Emas emas);

    List<Emas> getAllPembelian();

    Emas getPembelianByGram(Integer gram);

}

public interface StockAccount {
    void newStockAccount(String filename);
    double valueof();
    void buy(int amount, String symbol);
    void sell(int amount, String sysmbol);
    void save(String filename);
    void printReport();

}

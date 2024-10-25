package Tranning;
public class Price {

    public static void main(String[] args) {
        double priceInput = 0.10873543871;
        double tickSize = 0.00001;
        int pricePrecision = 7;
        double minPrice = 0.00000008;
        double maxPrice = 10;

        // chắc chắn  làm tròn priceInput về số thập phân pricePrecision và gán cho pricerounded ( 
        double pricerounded = Math.round(priceInput * Math.pow(10, pricePrecision)) / Math.pow(10, pricePrecision);

        // tìm giá trị gần nhất chia hết cho tickSize
        double priceadjusted = Math.floor(pricerounded / tickSize) * tickSize;
        
        // so sánh giá trị dự kiến với min và max 
        if (priceadjusted < minPrice) {
            priceadjusted = minPrice;
        } else if (priceadjusted > maxPrice) {
            priceadjusted = maxPrice;
        }

        System.out.println(" Price : " + priceadjusted);
    }

}

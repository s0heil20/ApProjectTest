import models.*;
import models.account.Customer;
import models.discount.CodedDiscount;
import models.discount.Sale;
import models.product.Product;

import java.util.ArrayList;
import java.util.Date;

public class Manager {
    //my part:
    public ArrayList<CodedDiscount> getAllCodedDiscounts(){
        return null;
    }

    public CodedDiscount getDiscountByCode(String code){
        return null;
    }

    public void editDiscountByCode(Date newEndDate,int newPercent,int newMaxDiscount){

    }

    public void removeDiscountCode(String code){

    }

    public ArrayList<Sale> getAllSales(){
        return null;
    }

    public Sale getSaleById(String id){
        return null;
    }

    public void sendEditRequestForSaleById(String id, Date newEndDate, Date newStartDate, int newPercent, ArrayList<Product> addingProduct, ArrayList<Product> removingProduct){

    }

    public ArrayList<CodedDiscount> getCodedDiscountByCustomer(Customer customer){
        return null;
    }

    public void addCommentToProduct(String title,String content,Product product){

    }

    public void rateProductById(String id, float score){

    }




}

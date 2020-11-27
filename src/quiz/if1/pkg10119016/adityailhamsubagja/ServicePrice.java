/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119016.adityailhamsubagja;

/**
 *
 * @author aditi
 */
public class ServicePrice implements ServiceItem {
    private float priceService;
    private float discount;
    
    public float getPriceService() {
        return this.priceService;
    }
    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
   
}

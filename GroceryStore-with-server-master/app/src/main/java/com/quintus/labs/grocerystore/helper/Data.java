package com.quintus.labs.grocerystore.helper;

import com.quintus.labs.grocerystore.model.Offer;

import java.util.ArrayList;
import java.util.List;


public class Data {

    List<Offer> offerList = new ArrayList<>();


    public List<Offer> getOfferList() {
        Offer offer = new Offer("https://offersmonk.com/wp-content/uploads/2019/02/Medlife_Store_Offers.png");
        offerList.add(offer);
        offer = new Offer("https://lh3.googleusercontent.com/proxy/r9hGK7awK0-J2g1QFhEZw306IFDWFbjQC0MzQCec6B8EtE-O0GNxglq-wP7Q-fYi9sc3ZR0xihZMAMLvVV28uRZLP85G72bey3RjrPfNhcCAZxJnKk8a");
        offerList.add(offer);
        offer = new Offer("https://d3ow2108bmqeui.cloudfront.net/marketing/comp_cod.jpg");
        offerList.add(offer);
        offer = new Offer("https://www.pulseplus.in/content/images/offers/25offer-banner.jpg");
        offerList.add(offer);
        offer = new Offer("https://image.freepik.com/free-vector/abstract-colorful-sales-wallpaper-with-special-offer_23-2148391237.jpg");
        offerList.add(offer);
        offer = new Offer("https://www.netmeds.com/images/cms/wysiwyg/offers/india-banega-healthy/2018/01/web/lp.jpg");
        offerList.add(offer);


        return offerList;
    }
}

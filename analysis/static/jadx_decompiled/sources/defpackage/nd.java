package defpackage;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.util.Pair;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nd implements rke {
    public static final Address b = new Address(Locale.ROOT);
    public static final Map c = Collections.synchronizedMap(new i56(100, 0));
    public final khe a;

    public nd(Context context, khe kheVar) {
        this.a = new khe(new md(context, kheVar));
    }

    public static String a(Address address, String str, Address address2) {
        if (address2 == null) {
            return str;
        }
        String locality = address.getLocality();
        return (e(locality) || oag.d(locality, address2.getLocality())) ? str : rh4.j(locality, ", ", str);
    }

    public static String b(Address address, String str, Address address2) {
        if (address2 == null) {
            return str;
        }
        String countryName = address.getCountryName();
        return (e(countryName) || oag.d(countryName, address2.getCountryName())) ? str : rh4.j(countryName, ", ", str);
    }

    public static boolean e(String str) {
        return oag.t(str) || oag.d(str, "Unnamed Road") || oag.d(str, "Null");
    }

    public final String c(double d, double d2, double d3, double d4) throws IOException {
        Address addressD = d(d, d2);
        if (addressD == null) {
            return "";
        }
        Address addressD2 = d(d3, d4);
        String thoroughfare = addressD.getThoroughfare();
        if (e(thoroughfare)) {
            thoroughfare = null;
        } else {
            String subThoroughfare = addressD.getSubThoroughfare();
            if (!e(subThoroughfare)) {
                thoroughfare = rh4.j(thoroughfare, ", ", subThoroughfare);
            }
        }
        if (!e(thoroughfare)) {
            return are.e(b(addressD, a(addressD, thoroughfare, addressD2), addressD2));
        }
        String featureName = addressD.getFeatureName();
        if (!e(featureName) && !featureName.matches("\\d+")) {
            return are.e(b(addressD, a(addressD, featureName, addressD2), addressD2));
        }
        String locality = addressD.getLocality();
        if (!e(locality)) {
            return are.e(b(addressD, locality, addressD2));
        }
        String adminArea = addressD.getAdminArea();
        if (!e(adminArea)) {
            return are.e(b(addressD, adminArea, addressD2));
        }
        String countryName = addressD.getCountryName();
        if (!e(countryName)) {
            return are.e(countryName);
        }
        String addressLine = addressD.getMaxAddressLineIndex() != -1 ? addressD.getAddressLine(0) : "";
        if (!e(addressLine)) {
            return addressLine;
        }
        String countryName2 = addressD.getCountryName();
        if (!oag.t(countryName2)) {
            addressLine = countryName2;
        }
        String locality2 = addressD.getLocality();
        return oag.t(locality2) ? addressLine : oag.t(countryName2) ? locality2 : rh4.j(addressLine, ", ", locality2);
    }

    public final Address d(double d, double d2) throws IOException {
        if (d == 0.0d && d2 == 0.0d) {
            return null;
        }
        Pair pair = new Pair(Double.valueOf(d), Double.valueOf(d2));
        Map map = c;
        Address address = (Address) map.get(pair);
        Address address2 = b;
        if (address == address2) {
            return null;
        }
        if (address != null) {
            return address;
        }
        try {
            List<Address> fromLocation = ((Geocoder) this.a.getValue()).getFromLocation(d, d2, 1);
            if (nd7.D(fromLocation)) {
                map.put(pair, address2);
                return null;
            }
            Address address3 = fromLocation.get(0);
            map.put(pair, address3);
            return address3;
        } catch (IOException unused) {
            Locale locale = Locale.ENGLISH;
            hm9.p("nd", "Can't decode latitude = " + d + " longitude = " + d2, null);
            return null;
        }
    }

    public final boolean f(double d, double d2, double d3, double d4) {
        float[] fArr = new float[1];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        return fArr[0] < 10.0f;
    }
}

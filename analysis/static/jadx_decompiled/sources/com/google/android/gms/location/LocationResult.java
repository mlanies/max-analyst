package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ay7;
import defpackage.dr7;
import defpackage.mfg;
import defpackage.n3;
import defpackage.nhg;
import defpackage.s36;
import defpackage.vqf;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class LocationResult extends n3 implements ReflectedParcelable {
    public final List a;
    public static final List b = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new vqf(22);

    public LocationResult(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        int i = Build.VERSION.SDK_INT;
        List<Location> list = this.a;
        if (i >= 31) {
            return list.equals(locationResult.a);
        }
        if (list.size() != locationResult.a.size()) {
            return false;
        }
        Iterator it = locationResult.a.iterator();
        for (Location location : list) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !s36.l(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = mfg.a;
        List<Location> list = this.a;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z = false;
        for (Location location : list) {
            sb.ensureCapacity(100);
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                if (location.isFromMockProvider()) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat2 = mfg.a;
                sb.append(decimalFormat2.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat2.format(location.getLongitude()));
                boolean zHasAccuracy = location.hasAccuracy();
                DecimalFormat decimalFormat3 = mfg.b;
                if (zHasAccuracy) {
                    sb.append("±");
                    sb.append(decimalFormat3.format(location.getAccuracy()));
                    sb.append("m");
                }
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat3.format(location.getAltitude()));
                    if (dr7.f(location)) {
                        sb.append("±");
                        sb.append(decimalFormat3.format(dr7.c(location)));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat3.format(location.getSpeed()));
                    if (dr7.e(location)) {
                        sb.append("±");
                        sb.append(decimalFormat3.format(dr7.b(location)));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat3.format(location.getBearing()));
                    if (dr7.d(location)) {
                        sb.append("±");
                        sb.append(decimalFormat3.format(dr7.a(location)));
                    }
                    sb.append("°");
                }
                Bundle extras = location.getExtras();
                String string2 = extras != null ? extras.getString("floorLabel") : null;
                if (string2 != null) {
                    sb.append(", fl=");
                    sb.append(string2);
                }
                Bundle extras2 = location.getExtras();
                String string3 = extras2 != null ? extras2.getString("levelId") : null;
                if (string3 != null) {
                    sb.append(", lv=");
                    sb.append(string3);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + jCurrentTimeMillis;
                if (millis >= 0) {
                    string = nhg.a.format(new Date(millis));
                } else {
                    SimpleDateFormat simpleDateFormat = nhg.a;
                    string = Long.toString(millis);
                }
                sb.append(string);
                sb.append('}');
            }
            sb.append(", ");
            z = true;
        }
        if (z) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.S(parcel, this.a, 1);
        ay7.W(parcel, iT);
    }
}

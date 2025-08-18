package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ay7;
import defpackage.ghg;
import defpackage.n3;
import defpackage.nhg;
import defpackage.s36;
import defpackage.vqf;
import java.util.Arrays;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class LocationRequest extends n3 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new vqf(21);
    public final long X;
    public final int Y;
    public final float Z;
    public int a;
    public long b;
    public long c;
    public final long o;
    public final boolean s0;
    public long t0;
    public final int u0;
    public final int v0;
    public final boolean w0;
    public final WorkSource x0;
    public final ghg y0;

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ghg ghgVar) {
        long j7;
        this.a = i;
        if (i == 105) {
            this.b = Long.MAX_VALUE;
            j7 = j;
        } else {
            j7 = j;
            this.b = j7;
        }
        this.c = j2;
        this.o = j3;
        this.X = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.Y = i2;
        this.Z = f;
        this.s0 = z;
        this.t0 = j6 != -1 ? j6 : j7;
        this.u0 = i3;
        this.v0 = i4;
        this.w0 = z2;
        this.x0 = workSource;
        this.y0 = ghgVar;
    }

    public static String c(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = nhg.b;
        synchronized (sb) {
            sb.setLength(0);
            nhg.a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public final boolean b() {
        long j = this.o;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            int i = this.a;
            if (i == locationRequest.a && ((i == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && b() == locationRequest.b() && ((!b() || this.o == locationRequest.o) && this.X == locationRequest.X && this.Y == locationRequest.Y && this.Z == locationRequest.Z && this.s0 == locationRequest.s0 && this.u0 == locationRequest.u0 && this.v0 == locationRequest.v0 && this.w0 == locationRequest.w0 && this.x0.equals(locationRequest.x0) && s36.l(this.y0, locationRequest.y0)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.x0});
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        int i2 = this.a;
        ay7.X(parcel, 1, 4);
        parcel.writeInt(i2);
        long j = this.b;
        ay7.X(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.c;
        ay7.X(parcel, 3, 8);
        parcel.writeLong(j2);
        ay7.X(parcel, 6, 4);
        parcel.writeInt(this.Y);
        ay7.X(parcel, 7, 4);
        parcel.writeFloat(this.Z);
        ay7.X(parcel, 8, 8);
        parcel.writeLong(this.o);
        ay7.X(parcel, 9, 4);
        parcel.writeInt(this.s0 ? 1 : 0);
        ay7.X(parcel, 10, 8);
        parcel.writeLong(this.X);
        long j3 = this.t0;
        ay7.X(parcel, 11, 8);
        parcel.writeLong(j3);
        ay7.X(parcel, 12, 4);
        parcel.writeInt(this.u0);
        ay7.X(parcel, 13, 4);
        parcel.writeInt(this.v0);
        ay7.X(parcel, 15, 4);
        parcel.writeInt(this.w0 ? 1 : 0);
        ay7.P(parcel, 16, this.x0, i);
        ay7.P(parcel, 17, this.y0, i);
        ay7.W(parcel, iT);
    }

    @Deprecated
    public LocationRequest() {
        this(HttpStatus.SC_PROCESSING, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}

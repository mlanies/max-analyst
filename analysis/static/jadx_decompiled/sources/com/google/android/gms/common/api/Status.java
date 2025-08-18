package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ay7;
import defpackage.n3;
import defpackage.ph3;
import defpackage.qz7;
import defpackage.rjc;
import defpackage.s36;
import defpackage.ufg;
import defpackage.zr6;
import java.util.Arrays;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class Status extends n3 implements rjc, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final ph3 o;
    public static final Status X = new Status(0, null, null, null);
    public static final Status Y = new Status(14, null, null, null);
    public static final Status Z = new Status(8, null, null, null);
    public static final Status s0 = new Status(15, null, null, null);
    public static final Status t0 = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new ufg(1);

    public Status(int i, String str, PendingIntent pendingIntent, ph3 ph3Var) {
        this.a = i;
        this.b = str;
        this.c = pendingIntent;
        this.o = ph3Var;
    }

    @Override // defpackage.rjc
    public final Status a() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && s36.l(this.b, status.b) && s36.l(this.c, status.c) && s36.l(this.o, status.o);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.o});
    }

    public final String toString() {
        qz7 qz7Var = new qz7(this);
        String strH = this.b;
        if (strH == null) {
            int i = this.a;
            switch (i) {
                case -1:
                    strH = "SUCCESS_CACHE";
                    break;
                case 0:
                    strH = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                default:
                    strH = zr6.h(i, "unknown status code: ");
                    break;
                case 2:
                    strH = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strH = "SERVICE_DISABLED";
                    break;
                case 4:
                    strH = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strH = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strH = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strH = "NETWORK_ERROR";
                    break;
                case 8:
                    strH = "INTERNAL_ERROR";
                    break;
                case 10:
                    strH = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strH = "ERROR";
                    break;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    strH = "INTERRUPTED";
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    strH = "TIMEOUT";
                    break;
                case 16:
                    strH = "CANCELED";
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    strH = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strH = "DEAD_CLIENT";
                    break;
                case 19:
                    strH = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strH = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strH = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strH = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        qz7Var.h(strH, "statusCode");
        qz7Var.h(this.c, "resolution");
        return qz7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        ay7.X(parcel, 1, 4);
        parcel.writeInt(this.a);
        ay7.Q(parcel, 2, this.b);
        ay7.P(parcel, 3, this.c, i);
        ay7.P(parcel, 4, this.o, i);
        ay7.W(parcel, iT);
    }
}

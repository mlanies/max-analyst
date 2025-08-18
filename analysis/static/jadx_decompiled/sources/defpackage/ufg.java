package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class ufg implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ ufg(int i) {
        this.a = i;
    }

    public static void a(qc6 qc6Var, Parcel parcel, int i) {
        int iT = ay7.T(parcel, 20293);
        int i2 = qc6Var.a;
        ay7.X(parcel, 1, 4);
        parcel.writeInt(i2);
        ay7.X(parcel, 2, 4);
        parcel.writeInt(qc6Var.b);
        ay7.X(parcel, 3, 4);
        parcel.writeInt(qc6Var.c);
        ay7.Q(parcel, 4, qc6Var.o);
        ay7.O(parcel, 5, qc6Var.X);
        ay7.R(parcel, 6, qc6Var.Y, i);
        ay7.M(parcel, 7, qc6Var.Z);
        ay7.P(parcel, 8, qc6Var.s0, i);
        ay7.R(parcel, 10, qc6Var.t0, i);
        ay7.R(parcel, 11, qc6Var.u0, i);
        ay7.X(parcel, 12, 4);
        parcel.writeInt(qc6Var.v0 ? 1 : 0);
        ay7.X(parcel, 13, 4);
        parcel.writeInt(qc6Var.w0);
        boolean z = qc6Var.x0;
        ay7.X(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        ay7.Q(parcel, 15, qc6Var.y0);
        ay7.W(parcel, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        View view;
        switch (this.a) {
            case 0:
                int iD0 = br7.d0(parcel);
                PendingIntent pendingIntent = null;
                int iU = 0;
                int iU2 = 0;
                String strP = null;
                while (parcel.dataPosition() < iD0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iU = br7.U(parcel, i);
                    } else if (c == 2) {
                        iU2 = br7.U(parcel, i);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) br7.o(parcel, i, PendingIntent.CREATOR);
                    } else if (c != 4) {
                        br7.X(parcel, i);
                    } else {
                        strP = br7.p(parcel, i);
                    }
                }
                br7.s(parcel, iD0);
                return new ph3(iU, iU2, pendingIntent, strP);
            case 1:
                int iD02 = br7.d0(parcel);
                String strP2 = null;
                ph3 ph3Var = null;
                int iU3 = 0;
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iD02) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iU3 = br7.U(parcel, i2);
                    } else if (c2 == 2) {
                        strP2 = br7.p(parcel, i2);
                    } else if (c2 == 3) {
                        pendingIntent2 = (PendingIntent) br7.o(parcel, i2, PendingIntent.CREATOR);
                    } else if (c2 != 4) {
                        br7.X(parcel, i2);
                    } else {
                        ph3Var = (ph3) br7.o(parcel, i2, ph3.CREATOR);
                    }
                }
                br7.s(parcel, iD02);
                return new Status(iU3, strP2, pendingIntent2, ph3Var);
            case 2:
                return new sgg(parcel.readStrongBinder());
            case 3:
                int iD03 = br7.d0(parcel);
                LatLng latLng = null;
                boolean zO = false;
                float fR = 0.0f;
                float fR2 = 0.0f;
                double d = 0.0d;
                ArrayList arrayListR = null;
                int iU4 = 0;
                int iU5 = 0;
                boolean zO2 = false;
                while (parcel.dataPosition() < iD03) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            latLng = (LatLng) br7.o(parcel, i3, LatLng.CREATOR);
                            break;
                        case 3:
                            br7.h0(parcel, i3, 8);
                            d = parcel.readDouble();
                            break;
                        case 4:
                            fR = br7.R(parcel, i3);
                            break;
                        case 5:
                            iU4 = br7.U(parcel, i3);
                            break;
                        case 6:
                            iU5 = br7.U(parcel, i3);
                            break;
                        case 7:
                            fR2 = br7.R(parcel, i3);
                            break;
                        case '\b':
                            zO2 = br7.O(parcel, i3);
                            break;
                        case '\t':
                            zO = br7.O(parcel, i3);
                            break;
                        case '\n':
                            arrayListR = br7.r(parcel, i3, tra.CREATOR);
                            break;
                        default:
                            br7.X(parcel, i3);
                            break;
                    }
                }
                br7.s(parcel, iD03);
                w13 w13Var = new w13();
                w13Var.a = latLng;
                w13Var.b = d;
                w13Var.c = fR;
                w13Var.o = iU4;
                w13Var.X = iU5;
                w13Var.Y = fR2;
                w13Var.Z = zO2;
                w13Var.s0 = zO;
                w13Var.t0 = arrayListR;
                return w13Var;
            case 4:
                int iD04 = br7.d0(parcel);
                long jV = -1;
                int iU6 = 0;
                String strP3 = null;
                while (parcel.dataPosition() < iD04) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        strP3 = br7.p(parcel, i4);
                    } else if (c3 == 2) {
                        iU6 = br7.U(parcel, i4);
                    } else if (c3 != 3) {
                        br7.X(parcel, i4);
                    } else {
                        jV = br7.V(parcel, i4);
                    }
                }
                br7.s(parcel, iD04);
                return new pe5(jV, strP3, iU6);
            case 5:
                int iD05 = br7.d0(parcel);
                String strP4 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strP5 = "";
                while (parcel.dataPosition() < iD05) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 4) {
                        strP4 = br7.p(parcel, i5);
                    } else if (c4 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) br7.o(parcel, i5, GoogleSignInAccount.CREATOR);
                    } else if (c4 != '\b') {
                        br7.X(parcel, i5);
                    } else {
                        strP5 = br7.p(parcel, i5);
                    }
                }
                br7.s(parcel, iD05);
                SignInAccount signInAccount = new SignInAccount();
                signInAccount.b = googleSignInAccount;
                fp3.k(strP4, "8.3 and 8.4 SDKs require non-null email");
                signInAccount.a = strP4;
                fp3.k(strP5, "8.3 and 8.4 SDKs require non-null userId");
                signInAccount.c = strP5;
                return signInAccount;
            case 6:
                int iD06 = br7.d0(parcel);
                String strP6 = null;
                int iU7 = 0;
                while (parcel.dataPosition() < iD06) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 1) {
                        strP6 = br7.p(parcel, i6);
                    } else if (c5 != 2) {
                        br7.X(parcel, i6);
                    } else {
                        iU7 = br7.U(parcel, i6);
                    }
                }
                br7.s(parcel, iD06);
                return new lgg(strP6, iU7);
            case 7:
                int iD07 = br7.d0(parcel);
                IBinder iBinderT = null;
                IBinder iBinderT2 = null;
                PendingIntent pendingIntent3 = null;
                String strP7 = null;
                int iU8 = 0;
                while (parcel.dataPosition() < iD07) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 1) {
                        iU8 = br7.U(parcel, i7);
                    } else if (c6 == 2) {
                        iBinderT = br7.T(parcel, i7);
                    } else if (c6 == 3) {
                        iBinderT2 = br7.T(parcel, i7);
                    } else if (c6 == 4) {
                        pendingIntent3 = (PendingIntent) br7.o(parcel, i7, PendingIntent.CREATOR);
                    } else if (c6 != 6) {
                        br7.X(parcel, i7);
                    } else {
                        strP7 = br7.p(parcel, i7);
                    }
                }
                br7.s(parcel, iD07);
                return new khg(iU8, iBinderT, iBinderT2, pendingIntent3, strP7);
            case 8:
                int iD08 = br7.d0(parcel);
                long jV2 = Long.MAX_VALUE;
                LocationRequest locationRequest = null;
                ArrayList arrayListR2 = null;
                boolean zO3 = false;
                boolean zO4 = false;
                boolean zO5 = false;
                boolean zO6 = false;
                while (parcel.dataPosition() < iD08) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        locationRequest = (LocationRequest) br7.o(parcel, i8, LocationRequest.CREATOR);
                    } else if (c7 == 5) {
                        arrayListR2 = br7.r(parcel, i8, m33.CREATOR);
                    } else if (c7 == '\b') {
                        zO3 = br7.O(parcel, i8);
                    } else if (c7 != '\t') {
                        switch (c7) {
                            case 11:
                                zO5 = br7.O(parcel, i8);
                                break;
                            case Protos.Attaches.Attach.PRESENT /* 12 */:
                                zO6 = br7.O(parcel, i8);
                                break;
                            case '\r':
                                br7.p(parcel, i8);
                                break;
                            case Protos.Attaches.Attach.LOCATION /* 14 */:
                                jV2 = br7.V(parcel, i8);
                                break;
                            default:
                                br7.X(parcel, i8);
                                break;
                        }
                    } else {
                        zO4 = br7.O(parcel, i8);
                    }
                }
                br7.s(parcel, iD08);
                return new lhg(locationRequest, arrayListR2, zO3, zO4, zO5, zO6, jV2);
            case 9:
                int iD09 = br7.d0(parcel);
                lhg lhgVar = null;
                IBinder iBinderT3 = null;
                IBinder iBinderT4 = null;
                PendingIntent pendingIntent4 = null;
                IBinder iBinderT5 = null;
                String strP8 = null;
                int iU9 = 1;
                while (parcel.dataPosition() < iD09) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iU9 = br7.U(parcel, i9);
                            break;
                        case 2:
                            lhgVar = (lhg) br7.o(parcel, i9, lhg.CREATOR);
                            break;
                        case 3:
                            iBinderT3 = br7.T(parcel, i9);
                            break;
                        case 4:
                            pendingIntent4 = (PendingIntent) br7.o(parcel, i9, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinderT4 = br7.T(parcel, i9);
                            break;
                        case 6:
                            iBinderT5 = br7.T(parcel, i9);
                            break;
                        case 7:
                        default:
                            br7.X(parcel, i9);
                            break;
                        case '\b':
                            strP8 = br7.p(parcel, i9);
                            break;
                    }
                }
                br7.s(parcel, iD09);
                return new mhg(iU9, lhgVar, iBinderT3, iBinderT4, pendingIntent4, iBinderT5, strP8);
            case 10:
                int iD010 = br7.d0(parcel);
                String strP9 = null;
                String strP10 = null;
                String strP11 = null;
                ArrayList arrayListR3 = null;
                ghg ghgVar = null;
                int iU10 = 0;
                while (parcel.dataPosition() < iD010) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        iU10 = br7.U(parcel, i10);
                    } else if (c8 == 3) {
                        strP9 = br7.p(parcel, i10);
                    } else if (c8 == 4) {
                        strP10 = br7.p(parcel, i10);
                    } else if (c8 == 6) {
                        strP11 = br7.p(parcel, i10);
                    } else if (c8 == 7) {
                        ghgVar = (ghg) br7.o(parcel, i10, ghg.CREATOR);
                    } else if (c8 != '\b') {
                        br7.X(parcel, i10);
                    } else {
                        arrayListR3 = br7.r(parcel, i10, pe5.CREATOR);
                    }
                }
                br7.s(parcel, iD010);
                return new ghg(iU10, strP9, strP10, strP11, arrayListR3, ghgVar);
            case 11:
                int iD011 = br7.d0(parcel);
                Bundle bundleN = null;
                wh3 wh3Var = null;
                int iU11 = 0;
                pe5[] pe5VarArr = null;
                while (parcel.dataPosition() < iD011) {
                    int i11 = parcel.readInt();
                    char c9 = (char) i11;
                    if (c9 == 1) {
                        bundleN = br7.n(parcel, i11);
                    } else if (c9 == 2) {
                        pe5VarArr = (pe5[]) br7.q(parcel, i11, pe5.CREATOR);
                    } else if (c9 == 3) {
                        iU11 = br7.U(parcel, i11);
                    } else if (c9 != 4) {
                        br7.X(parcel, i11);
                    } else {
                        wh3Var = (wh3) br7.o(parcel, i11, wh3.CREATOR);
                    }
                }
                br7.s(parcel, iD011);
                vig vigVar = new vig();
                vigVar.a = bundleN;
                vigVar.b = pe5VarArr;
                vigVar.c = iU11;
                vigVar.o = wh3Var;
                return vigVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int iD012 = br7.d0(parcel);
                xmc xmcVar = null;
                int[] iArrCreateIntArray = null;
                int[] iArrCreateIntArray2 = null;
                boolean zO7 = false;
                boolean zO8 = false;
                int iU12 = 0;
                while (parcel.dataPosition() < iD012) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            xmcVar = (xmc) br7.o(parcel, i12, xmc.CREATOR);
                            break;
                        case 2:
                            zO7 = br7.O(parcel, i12);
                            break;
                        case 3:
                            zO8 = br7.O(parcel, i12);
                            break;
                        case 4:
                            int iW = br7.W(parcel, i12);
                            int iDataPosition = parcel.dataPosition();
                            if (iW != 0) {
                                iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iW);
                                break;
                            } else {
                                iArrCreateIntArray = null;
                                break;
                            }
                        case 5:
                            iU12 = br7.U(parcel, i12);
                            break;
                        case 6:
                            int iW2 = br7.W(parcel, i12);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iW2 != 0) {
                                iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iW2);
                                break;
                            } else {
                                iArrCreateIntArray2 = null;
                                break;
                            }
                        default:
                            br7.X(parcel, i12);
                            break;
                    }
                }
                br7.s(parcel, iD012);
                return new wh3(xmcVar, zO7, zO8, iArrCreateIntArray, iU12, iArrCreateIntArray2);
            case 13:
                int iD013 = br7.d0(parcel);
                Status status = null;
                while (parcel.dataPosition() < iD013) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        br7.X(parcel, i13);
                    } else {
                        status = (Status) br7.o(parcel, i13, Status.CREATOR);
                    }
                }
                br7.s(parcel, iD013);
                return new ejg(status);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                int iD014 = br7.d0(parcel);
                LatLng latLng2 = null;
                LatLng latLng3 = null;
                while (parcel.dataPosition() < iD014) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 2) {
                        latLng2 = (LatLng) br7.o(parcel, i14, LatLng.CREATOR);
                    } else if (c10 != 3) {
                        br7.X(parcel, i14);
                    } else {
                        latLng3 = (LatLng) br7.o(parcel, i14, LatLng.CREATOR);
                    }
                }
                br7.s(parcel, iD014);
                return new LatLngBounds(latLng2, latLng3);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int iD015 = br7.d0(parcel);
                Scope[] scopeArr = qc6.z0;
                Bundle bundle = new Bundle();
                pe5[] pe5VarArr2 = qc6.A0;
                pe5[] pe5VarArr3 = pe5VarArr2;
                String strP12 = null;
                IBinder iBinderT6 = null;
                Account account = null;
                String strP13 = null;
                int iU13 = 0;
                int iU14 = 0;
                int iU15 = 0;
                boolean zO9 = false;
                int iU16 = 0;
                boolean zO10 = false;
                while (parcel.dataPosition() < iD015) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iU13 = br7.U(parcel, i15);
                            break;
                        case 2:
                            iU14 = br7.U(parcel, i15);
                            break;
                        case 3:
                            iU15 = br7.U(parcel, i15);
                            break;
                        case 4:
                            strP12 = br7.p(parcel, i15);
                            break;
                        case 5:
                            iBinderT6 = br7.T(parcel, i15);
                            break;
                        case 6:
                            scopeArr = (Scope[]) br7.q(parcel, i15, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = br7.n(parcel, i15);
                            break;
                        case '\b':
                            account = (Account) br7.o(parcel, i15, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            br7.X(parcel, i15);
                            break;
                        case '\n':
                            pe5VarArr2 = (pe5[]) br7.q(parcel, i15, pe5.CREATOR);
                            break;
                        case 11:
                            pe5VarArr3 = (pe5[]) br7.q(parcel, i15, pe5.CREATOR);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            zO9 = br7.O(parcel, i15);
                            break;
                        case '\r':
                            iU16 = br7.U(parcel, i15);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            zO10 = br7.O(parcel, i15);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            strP13 = br7.p(parcel, i15);
                            break;
                    }
                }
                br7.s(parcel, iD015);
                return new qc6(iU13, iU14, iU15, strP12, iBinderT6, scopeArr, bundle, account, pe5VarArr2, pe5VarArr3, zO9, iU16, zO10, strP13);
            case 16:
                int iD016 = br7.d0(parcel);
                double d2 = 0.0d;
                double d3 = 0.0d;
                while (parcel.dataPosition() < iD016) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 2) {
                        br7.h0(parcel, i16, 8);
                        d2 = parcel.readDouble();
                    } else if (c11 != 3) {
                        br7.X(parcel, i16);
                    } else {
                        br7.h0(parcel, i16, 8);
                        d3 = parcel.readDouble();
                    }
                }
                br7.s(parcel, iD016);
                return new LatLng(d2, d3);
            case LangUtils.HASH_SEED /* 17 */:
                int iD017 = br7.d0(parcel);
                String strP14 = null;
                while (parcel.dataPosition() < iD017) {
                    int i17 = parcel.readInt();
                    if (((char) i17) != 2) {
                        br7.X(parcel, i17);
                    } else {
                        strP14 = br7.p(parcel, i17);
                    }
                }
                br7.s(parcel, iD017);
                return new wy7(strP14);
            case 18:
                int iD018 = br7.d0(parcel);
                boolean zO11 = false;
                boolean zO12 = false;
                boolean zO13 = false;
                int iU17 = 0;
                int iU18 = 0;
                float fR3 = 1.0f;
                float fR4 = 0.5f;
                LatLng latLng4 = null;
                String strP15 = null;
                String strP16 = null;
                IBinder iBinderT7 = null;
                float fR5 = 0.0f;
                float fR6 = 0.0f;
                IBinder iBinderT8 = null;
                float fR7 = 0.0f;
                float fR8 = 0.0f;
                float fR9 = 0.0f;
                String strP17 = null;
                float fR10 = 0.0f;
                while (parcel.dataPosition() < iD018) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            latLng4 = (LatLng) br7.o(parcel, i18, LatLng.CREATOR);
                            break;
                        case 3:
                            strP15 = br7.p(parcel, i18);
                            break;
                        case 4:
                            strP16 = br7.p(parcel, i18);
                            break;
                        case 5:
                            iBinderT7 = br7.T(parcel, i18);
                            break;
                        case 6:
                            fR5 = br7.R(parcel, i18);
                            break;
                        case 7:
                            fR6 = br7.R(parcel, i18);
                            break;
                        case '\b':
                            zO11 = br7.O(parcel, i18);
                            break;
                        case '\t':
                            zO12 = br7.O(parcel, i18);
                            break;
                        case '\n':
                            zO13 = br7.O(parcel, i18);
                            break;
                        case 11:
                            fR7 = br7.R(parcel, i18);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            fR4 = br7.R(parcel, i18);
                            break;
                        case '\r':
                            fR8 = br7.R(parcel, i18);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            fR3 = br7.R(parcel, i18);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            fR9 = br7.R(parcel, i18);
                            break;
                        case 16:
                        default:
                            br7.X(parcel, i18);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            iU17 = br7.U(parcel, i18);
                            break;
                        case 18:
                            iBinderT8 = br7.T(parcel, i18);
                            break;
                        case 19:
                            iU18 = br7.U(parcel, i18);
                            break;
                        case 20:
                            strP17 = br7.p(parcel, i18);
                            break;
                        case 21:
                            fR10 = br7.R(parcel, i18);
                            break;
                    }
                }
                br7.s(parcel, iD018);
                g08 g08Var = new g08();
                g08Var.X = 0.5f;
                g08Var.Y = 1.0f;
                g08Var.s0 = true;
                g08Var.t0 = false;
                g08Var.u0 = 0.0f;
                g08Var.v0 = 0.5f;
                g08Var.w0 = 0.0f;
                g08Var.x0 = 1.0f;
                g08Var.z0 = 0;
                g08Var.a = latLng4;
                g08Var.b = strP15;
                g08Var.c = strP16;
                if (iBinderT7 == null) {
                    view = null;
                    g08Var.o = null;
                } else {
                    view = null;
                    g08Var.o = new rxd(oy9.K0(iBinderT7));
                }
                g08Var.X = fR5;
                g08Var.Y = fR6;
                g08Var.Z = zO11;
                g08Var.s0 = zO12;
                g08Var.t0 = zO13;
                g08Var.u0 = fR7;
                g08Var.v0 = fR4;
                g08Var.w0 = fR8;
                g08Var.x0 = fR3;
                g08Var.y0 = fR9;
                g08Var.B0 = iU18;
                g08Var.z0 = iU17;
                xr6 xr6VarK0 = oy9.K0(iBinderT8);
                g08Var.A0 = xr6VarK0 == null ? view : (View) oy9.L0(xr6VarK0);
                g08Var.C0 = strP17;
                g08Var.D0 = fR10;
                return g08Var;
            case 19:
                int iD019 = br7.d0(parcel);
                Float fS = null;
                int iU19 = 0;
                while (parcel.dataPosition() < iD019) {
                    int i19 = parcel.readInt();
                    char c12 = (char) i19;
                    if (c12 == 2) {
                        iU19 = br7.U(parcel, i19);
                    } else if (c12 != 3) {
                        br7.X(parcel, i19);
                    } else {
                        fS = br7.S(parcel, i19);
                    }
                }
                br7.s(parcel, iD019);
                return new tra(iU19, fS);
            case 20:
                int iD020 = br7.d0(parcel);
                ArrayList arrayListR4 = null;
                ez1 ez1Var = null;
                ez1 ez1Var2 = null;
                ArrayList arrayListR5 = null;
                ArrayList arrayListR6 = null;
                int iU20 = 0;
                boolean zO14 = false;
                boolean zO15 = false;
                boolean zO16 = false;
                int iU21 = 0;
                float fR11 = 0.0f;
                float fR12 = 0.0f;
                while (parcel.dataPosition() < iD020) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            arrayListR4 = br7.r(parcel, i20, LatLng.CREATOR);
                            break;
                        case 3:
                            fR11 = br7.R(parcel, i20);
                            break;
                        case 4:
                            iU20 = br7.U(parcel, i20);
                            break;
                        case 5:
                            fR12 = br7.R(parcel, i20);
                            break;
                        case 6:
                            zO14 = br7.O(parcel, i20);
                            break;
                        case 7:
                            zO15 = br7.O(parcel, i20);
                            break;
                        case '\b':
                            zO16 = br7.O(parcel, i20);
                            break;
                        case '\t':
                            ez1Var = (ez1) br7.o(parcel, i20, ez1.CREATOR);
                            break;
                        case '\n':
                            ez1Var2 = (ez1) br7.o(parcel, i20, ez1.CREATOR);
                            break;
                        case 11:
                            iU21 = br7.U(parcel, i20);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            arrayListR5 = br7.r(parcel, i20, tra.CREATOR);
                            break;
                        case '\r':
                            arrayListR6 = br7.r(parcel, i20, pae.CREATOR);
                            break;
                        default:
                            br7.X(parcel, i20);
                            break;
                    }
                }
                br7.s(parcel, iD020);
                return new i5b(arrayListR4, fR11, iU20, fR12, zO14, zO15, zO16, ez1Var, ez1Var2, iU21, arrayListR5, arrayListR6);
            case 21:
                int iD021 = br7.d0(parcel);
                IBinder iBinderT9 = null;
                while (parcel.dataPosition() < iD021) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        br7.X(parcel, i21);
                    } else {
                        iBinderT9 = br7.T(parcel, i21);
                    }
                }
                br7.s(parcel, iD021);
                return new txd(iBinderT9);
            default:
                int iD022 = br7.d0(parcel);
                String strP18 = null;
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iD022) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 2) {
                        strP18 = br7.p(parcel, i22);
                    } else if (c13 != 5) {
                        br7.X(parcel, i22);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) br7.o(parcel, i22, GoogleSignInOptions.CREATOR);
                    }
                }
                br7.s(parcel, iD022);
                return new SignInConfiguration(strP18, googleSignInOptions);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ph3[i];
            case 1:
                return new Status[i];
            case 2:
                return new sgg[i];
            case 3:
                return new w13[i];
            case 4:
                return new pe5[i];
            case 5:
                return new SignInAccount[i];
            case 6:
                return new lgg[i];
            case 7:
                return new khg[i];
            case 8:
                return new lhg[i];
            case 9:
                return new mhg[i];
            case 10:
                return new ghg[i];
            case 11:
                return new vig[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new wh3[i];
            case 13:
                return new ejg[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new LatLngBounds[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new qc6[i];
            case 16:
                return new LatLng[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new wy7[i];
            case 18:
                return new g08[i];
            case 19:
                return new tra[i];
            case 20:
                return new i5b[i];
            case 21:
                return new txd[i];
            default:
                return new SignInConfiguration[i];
        }
    }
}

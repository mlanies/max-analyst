package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class vqf implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ vqf(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new yqf(parcel);
            case 1:
                return new zqf(parcel);
            case 2:
                int iD0 = br7.d0(parcel);
                Bundle bundleN = null;
                int iU = 0;
                int iU2 = 0;
                while (parcel.dataPosition() < iD0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iU = br7.U(parcel, i);
                    } else if (c == 2) {
                        iU2 = br7.U(parcel, i);
                    } else if (c != 3) {
                        br7.X(parcel, i);
                    } else {
                        bundleN = br7.n(parcel, i);
                    }
                }
                br7.s(parcel, iD0);
                return new qe6(iU, iU2, bundleN);
            case 3:
                int iD02 = br7.d0(parcel);
                String strP = null;
                int iU3 = 0;
                while (parcel.dataPosition() < iD02) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iU3 = br7.U(parcel, i2);
                    } else if (c2 != 2) {
                        br7.X(parcel, i2);
                    } else {
                        strP = br7.p(parcel, i2);
                    }
                }
                br7.s(parcel, iD02);
                return new m33(iU3, strP);
            case 4:
                int iD03 = br7.d0(parcel);
                ArrayList arrayListR = null;
                int iU4 = 0;
                while (parcel.dataPosition() < iD03) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        iU4 = br7.U(parcel, i3);
                    } else if (c3 != 2) {
                        br7.X(parcel, i3);
                    } else {
                        arrayListR = br7.r(parcel, i3, y99.CREATOR);
                    }
                }
                br7.s(parcel, iD03);
                return new moe(iU4, arrayListR);
            case 5:
                int iD04 = br7.d0(parcel);
                Intent intent = null;
                int iU5 = 0;
                int iU6 = 0;
                while (parcel.dataPosition() < iD04) {
                    int i4 = parcel.readInt();
                    char c4 = (char) i4;
                    if (c4 == 1) {
                        iU5 = br7.U(parcel, i4);
                    } else if (c4 == 2) {
                        iU6 = br7.U(parcel, i4);
                    } else if (c4 != 3) {
                        br7.X(parcel, i4);
                    } else {
                        intent = (Intent) br7.o(parcel, i4, Intent.CREATOR);
                    }
                }
                br7.s(parcel, iD04);
                return new edg(iU5, iU6, intent);
            case 6:
                int iD05 = br7.d0(parcel);
                String strP2 = null;
                String strP3 = null;
                String strP4 = null;
                String strP5 = null;
                Uri uri = null;
                String strP6 = null;
                String strP7 = null;
                ArrayList arrayListR2 = null;
                String strP8 = null;
                String strP9 = null;
                long jV = 0;
                int iU7 = 0;
                while (parcel.dataPosition() < iD05) {
                    int i5 = parcel.readInt();
                    switch ((char) i5) {
                        case 1:
                            iU7 = br7.U(parcel, i5);
                            break;
                        case 2:
                            strP2 = br7.p(parcel, i5);
                            break;
                        case 3:
                            strP3 = br7.p(parcel, i5);
                            break;
                        case 4:
                            strP4 = br7.p(parcel, i5);
                            break;
                        case 5:
                            strP5 = br7.p(parcel, i5);
                            break;
                        case 6:
                            uri = (Uri) br7.o(parcel, i5, Uri.CREATOR);
                            break;
                        case 7:
                            strP6 = br7.p(parcel, i5);
                            break;
                        case '\b':
                            jV = br7.V(parcel, i5);
                            break;
                        case '\t':
                            strP7 = br7.p(parcel, i5);
                            break;
                        case '\n':
                            arrayListR2 = br7.r(parcel, i5, Scope.CREATOR);
                            break;
                        case 11:
                            strP8 = br7.p(parcel, i5);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            strP9 = br7.p(parcel, i5);
                            break;
                        default:
                            br7.X(parcel, i5);
                            break;
                    }
                }
                br7.s(parcel, iD05);
                return new GoogleSignInAccount(iU7, strP2, strP3, strP4, strP5, uri, strP6, jV, strP7, arrayListR2, strP8, strP9);
            case 7:
                int iD06 = br7.d0(parcel);
                ArrayList arrayListR3 = null;
                ArrayList arrayListR4 = null;
                Account account = null;
                String strP10 = null;
                String strP11 = null;
                String strP12 = null;
                int iU8 = 0;
                boolean zO = false;
                boolean zO2 = false;
                boolean zO3 = false;
                while (parcel.dataPosition() < iD06) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iU8 = br7.U(parcel, i6);
                            break;
                        case 2:
                            arrayListR4 = br7.r(parcel, i6, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) br7.o(parcel, i6, Account.CREATOR);
                            break;
                        case 4:
                            zO = br7.O(parcel, i6);
                            break;
                        case 5:
                            zO2 = br7.O(parcel, i6);
                            break;
                        case 6:
                            zO3 = br7.O(parcel, i6);
                            break;
                        case 7:
                            strP10 = br7.p(parcel, i6);
                            break;
                        case '\b':
                            strP11 = br7.p(parcel, i6);
                            break;
                        case '\t':
                            arrayListR3 = br7.r(parcel, i6, qe6.CREATOR);
                            break;
                        case '\n':
                            strP12 = br7.p(parcel, i6);
                            break;
                        default:
                            br7.X(parcel, i6);
                            break;
                    }
                }
                br7.s(parcel, iD06);
                return new GoogleSignInOptions(iU8, arrayListR4, account, zO, zO2, zO3, strP10, strP11, GoogleSignInOptions.c(arrayListR3), strP12);
            case 8:
                int iD07 = br7.d0(parcel);
                ArrayList<String> arrayList = null;
                String strP13 = null;
                while (parcel.dataPosition() < iD07) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        int iW = br7.W(parcel, i7);
                        int iDataPosition = parcel.dataPosition();
                        if (iW == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iW);
                            arrayList = arrayListCreateStringArrayList;
                        }
                    } else if (c5 != 2) {
                        br7.X(parcel, i7);
                    } else {
                        strP13 = br7.p(parcel, i7);
                    }
                }
                br7.s(parcel, iD07);
                return new leg(strP13, arrayList);
            case 9:
                int iD08 = br7.d0(parcel);
                ph3 ph3Var = null;
                int iU9 = 0;
                weg wegVar = null;
                while (parcel.dataPosition() < iD08) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        iU9 = br7.U(parcel, i8);
                    } else if (c6 == 2) {
                        ph3Var = (ph3) br7.o(parcel, i8, ph3.CREATOR);
                    } else if (c6 != 3) {
                        br7.X(parcel, i8);
                    } else {
                        wegVar = (weg) br7.o(parcel, i8, weg.CREATOR);
                    }
                }
                br7.s(parcel, iD08);
                return new qeg(iU9, ph3Var, wegVar);
            case 10:
                int iD09 = br7.d0(parcel);
                int iU10 = -1;
                int iU11 = 0;
                int iU12 = 0;
                int iU13 = 0;
                int iU14 = 0;
                String strP14 = null;
                String strP15 = null;
                long jV2 = 0;
                long jV3 = 0;
                while (parcel.dataPosition() < iD09) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 1:
                            iU11 = br7.U(parcel, i9);
                            break;
                        case 2:
                            iU12 = br7.U(parcel, i9);
                            break;
                        case 3:
                            iU13 = br7.U(parcel, i9);
                            break;
                        case 4:
                            jV2 = br7.V(parcel, i9);
                            break;
                        case 5:
                            jV3 = br7.V(parcel, i9);
                            break;
                        case 6:
                            strP14 = br7.p(parcel, i9);
                            break;
                        case 7:
                            strP15 = br7.p(parcel, i9);
                            break;
                        case '\b':
                            iU14 = br7.U(parcel, i9);
                            break;
                        case '\t':
                            iU10 = br7.U(parcel, i9);
                            break;
                        default:
                            br7.X(parcel, i9);
                            break;
                    }
                }
                br7.s(parcel, iD09);
                return new y99(iU11, iU12, iU13, jV2, jV3, strP14, strP15, iU14, iU10);
            case 11:
                int iD010 = br7.d0(parcel);
                Account account2 = null;
                int iU15 = 0;
                int iU16 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iD010) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        iU15 = br7.U(parcel, i10);
                    } else if (c7 == 2) {
                        account2 = (Account) br7.o(parcel, i10, Account.CREATOR);
                    } else if (c7 == 3) {
                        iU16 = br7.U(parcel, i10);
                    } else if (c7 != 4) {
                        br7.X(parcel, i10);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) br7.o(parcel, i10, GoogleSignInAccount.CREATOR);
                    }
                }
                br7.s(parcel, iD010);
                return new veg(iU15, account2, iU16, googleSignInAccount);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int iD011 = br7.d0(parcel);
                int iU17 = 0;
                boolean zO4 = false;
                boolean zO5 = false;
                IBinder iBinderT = null;
                ph3 ph3Var2 = null;
                while (parcel.dataPosition() < iD011) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iU17 = br7.U(parcel, i11);
                    } else if (c8 == 2) {
                        iBinderT = br7.T(parcel, i11);
                    } else if (c8 == 3) {
                        ph3Var2 = (ph3) br7.o(parcel, i11, ph3.CREATOR);
                    } else if (c8 == 4) {
                        zO4 = br7.O(parcel, i11);
                    } else if (c8 != 5) {
                        br7.X(parcel, i11);
                    } else {
                        zO5 = br7.O(parcel, i11);
                    }
                }
                br7.s(parcel, iD011);
                return new weg(iU17, iBinderT, ph3Var2, zO4, zO5);
            case 13:
                int iD012 = br7.d0(parcel);
                float fR = 0.0f;
                float fR2 = 0.0f;
                LatLng latLng = null;
                float fR3 = 0.0f;
                while (parcel.dataPosition() < iD012) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 2) {
                        latLng = (LatLng) br7.o(parcel, i12, LatLng.CREATOR);
                    } else if (c9 == 3) {
                        fR = br7.R(parcel, i12);
                    } else if (c9 == 4) {
                        fR3 = br7.R(parcel, i12);
                    } else if (c9 != 5) {
                        br7.X(parcel, i12);
                    } else {
                        fR2 = br7.R(parcel, i12);
                    }
                }
                br7.s(parcel, iD012);
                return new CameraPosition(latLng, fR, fR3, fR2);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                int iD013 = br7.d0(parcel);
                Intent intent2 = null;
                while (parcel.dataPosition() < iD013) {
                    int i13 = parcel.readInt();
                    if (((char) i13) != 1) {
                        br7.X(parcel, i13);
                    } else {
                        intent2 = (Intent) br7.o(parcel, i13, Intent.CREATOR);
                    }
                }
                br7.s(parcel, iD013);
                return new r43(intent2);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                int iD014 = br7.d0(parcel);
                String strP16 = null;
                int iU18 = 0;
                while (parcel.dataPosition() < iD014) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        iU18 = br7.U(parcel, i14);
                    } else if (c10 != 2) {
                        br7.X(parcel, i14);
                    } else {
                        strP16 = br7.p(parcel, i14);
                    }
                }
                br7.s(parcel, iD014);
                return new Scope(iU18, strP16);
            case 16:
                int iD015 = br7.d0(parcel);
                ghg ghgVar = null;
                int iU19 = 0;
                boolean zO6 = false;
                long jV4 = Long.MAX_VALUE;
                while (parcel.dataPosition() < iD015) {
                    int i15 = parcel.readInt();
                    char c11 = (char) i15;
                    if (c11 == 1) {
                        jV4 = br7.V(parcel, i15);
                    } else if (c11 == 2) {
                        iU19 = br7.U(parcel, i15);
                    } else if (c11 == 3) {
                        zO6 = br7.O(parcel, i15);
                    } else if (c11 != 5) {
                        br7.X(parcel, i15);
                    } else {
                        ghgVar = (ghg) br7.o(parcel, i15, ghg.CREATOR);
                    }
                }
                br7.s(parcel, iD015);
                return new yd7(jV4, iU19, zO6, ghgVar);
            case LangUtils.HASH_SEED /* 17 */:
                int iD016 = br7.d0(parcel);
                nfg[] nfgVarArr = null;
                long jV5 = 0;
                int iU20 = 1;
                int iU21 = 1;
                int iU22 = 1000;
                while (parcel.dataPosition() < iD016) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iU20 = br7.U(parcel, i16);
                            break;
                        case 2:
                            iU21 = br7.U(parcel, i16);
                            break;
                        case 3:
                            jV5 = br7.V(parcel, i16);
                            break;
                        case 4:
                            iU22 = br7.U(parcel, i16);
                            break;
                        case 5:
                            nfgVarArr = (nfg[]) br7.q(parcel, i16, nfg.CREATOR);
                            break;
                        case 6:
                            br7.O(parcel, i16);
                            break;
                        default:
                            br7.X(parcel, i16);
                            break;
                    }
                }
                br7.s(parcel, iD016);
                return new LocationAvailability(iU22, iU20, iU21, jV5, nfgVarArr);
            case 18:
                int iD017 = br7.d0(parcel);
                int iU23 = 0;
                int iU24 = 0;
                byte bP = -1;
                byte bP2 = -1;
                CameraPosition cameraPosition = null;
                byte bP3 = -1;
                byte bP4 = -1;
                byte bP5 = -1;
                byte bP6 = -1;
                byte bP7 = -1;
                byte bP8 = -1;
                byte bP9 = -1;
                byte bP10 = -1;
                byte bP11 = -1;
                byte bP12 = -1;
                Float fS = null;
                Float fS2 = null;
                LatLngBounds latLngBounds = null;
                Integer numValueOf = null;
                String strP17 = null;
                while (parcel.dataPosition() < iD017) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            bP = br7.P(parcel, i17);
                            break;
                        case 3:
                            bP2 = br7.P(parcel, i17);
                            break;
                        case 4:
                            iU23 = br7.U(parcel, i17);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) br7.o(parcel, i17, CameraPosition.CREATOR);
                            break;
                        case 6:
                            bP3 = br7.P(parcel, i17);
                            break;
                        case 7:
                            bP4 = br7.P(parcel, i17);
                            break;
                        case '\b':
                            bP5 = br7.P(parcel, i17);
                            break;
                        case '\t':
                            bP6 = br7.P(parcel, i17);
                            break;
                        case '\n':
                            bP7 = br7.P(parcel, i17);
                            break;
                        case 11:
                            bP8 = br7.P(parcel, i17);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            bP9 = br7.P(parcel, i17);
                            break;
                        case '\r':
                        case 22:
                        default:
                            br7.X(parcel, i17);
                            break;
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                            bP10 = br7.P(parcel, i17);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            bP11 = br7.P(parcel, i17);
                            break;
                        case 16:
                            fS = br7.S(parcel, i17);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            fS2 = br7.S(parcel, i17);
                            break;
                        case 18:
                            latLngBounds = (LatLngBounds) br7.o(parcel, i17, LatLngBounds.CREATOR);
                            break;
                        case 19:
                            bP12 = br7.P(parcel, i17);
                            break;
                        case 20:
                            int iW2 = br7.W(parcel, i17);
                            if (iW2 != 0) {
                                br7.f0(parcel, iW2);
                                numValueOf = Integer.valueOf(parcel.readInt());
                                break;
                            } else {
                                numValueOf = null;
                                break;
                            }
                        case 21:
                            strP17 = br7.p(parcel, i17);
                            break;
                        case 23:
                            iU24 = br7.U(parcel, i17);
                            break;
                    }
                }
                br7.s(parcel, iD017);
                GoogleMapOptions googleMapOptions = new GoogleMapOptions();
                googleMapOptions.c = -1;
                googleMapOptions.y0 = null;
                googleMapOptions.z0 = null;
                googleMapOptions.A0 = null;
                googleMapOptions.C0 = null;
                googleMapOptions.D0 = null;
                googleMapOptions.a = br7.g0(bP);
                googleMapOptions.b = br7.g0(bP2);
                googleMapOptions.c = iU23;
                googleMapOptions.o = cameraPosition;
                googleMapOptions.X = br7.g0(bP3);
                googleMapOptions.Y = br7.g0(bP4);
                googleMapOptions.Z = br7.g0(bP5);
                googleMapOptions.s0 = br7.g0(bP6);
                googleMapOptions.t0 = br7.g0(bP7);
                googleMapOptions.u0 = br7.g0(bP8);
                googleMapOptions.v0 = br7.g0(bP9);
                googleMapOptions.w0 = br7.g0(bP10);
                googleMapOptions.x0 = br7.g0(bP11);
                googleMapOptions.y0 = fS;
                googleMapOptions.z0 = fS2;
                googleMapOptions.A0 = latLngBounds;
                googleMapOptions.B0 = br7.g0(bP12);
                googleMapOptions.C0 = numValueOf;
                googleMapOptions.D0 = strP17;
                googleMapOptions.E0 = iU24;
                return googleMapOptions;
            case 19:
                int iD018 = br7.d0(parcel);
                txd txdVar = null;
                int iU25 = 0;
                int iU26 = 0;
                boolean zO7 = false;
                float fR4 = 0.0f;
                while (parcel.dataPosition() < iD018) {
                    int i18 = parcel.readInt();
                    char c12 = (char) i18;
                    if (c12 == 2) {
                        fR4 = br7.R(parcel, i18);
                    } else if (c12 == 3) {
                        iU25 = br7.U(parcel, i18);
                    } else if (c12 == 4) {
                        iU26 = br7.U(parcel, i18);
                    } else if (c12 == 5) {
                        zO7 = br7.O(parcel, i18);
                    } else if (c12 != 6) {
                        br7.X(parcel, i18);
                    } else {
                        txdVar = (txd) br7.o(parcel, i18, txd.CREATOR);
                    }
                }
                br7.s(parcel, iD018);
                return new mae(fR4, iU25, iU26, zO7, txdVar);
            case 20:
                int iD019 = br7.d0(parcel);
                double d = 0.0d;
                mae maeVar = null;
                while (parcel.dataPosition() < iD019) {
                    int i19 = parcel.readInt();
                    char c13 = (char) i19;
                    if (c13 == 2) {
                        maeVar = (mae) br7.o(parcel, i19, mae.CREATOR);
                    } else if (c13 != 3) {
                        br7.X(parcel, i19);
                    } else {
                        br7.h0(parcel, i19, 8);
                        d = parcel.readDouble();
                    }
                }
                br7.s(parcel, iD019);
                return new pae(maeVar, d);
            case 21:
                int iD020 = br7.d0(parcel);
                WorkSource workSource = new WorkSource();
                ghg ghgVar2 = null;
                boolean zO8 = false;
                int iU27 = 0;
                int iU28 = 0;
                boolean zO9 = false;
                long jV6 = -1;
                float fR5 = 0.0f;
                int iU29 = Integer.MAX_VALUE;
                long jV7 = Long.MAX_VALUE;
                long jV8 = Long.MAX_VALUE;
                long jV9 = 0;
                long jV10 = 600000;
                long jV11 = 3600000;
                int iU30 = 102;
                while (parcel.dataPosition() < iD020) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iU30 = br7.U(parcel, i20);
                            break;
                        case 2:
                            jV11 = br7.V(parcel, i20);
                            break;
                        case 3:
                            jV10 = br7.V(parcel, i20);
                            break;
                        case 4:
                        case Protos.Attaches.Attach.LOCATION /* 14 */:
                        default:
                            br7.X(parcel, i20);
                            break;
                        case 5:
                            jV7 = br7.V(parcel, i20);
                            break;
                        case 6:
                            iU29 = br7.U(parcel, i20);
                            break;
                        case 7:
                            fR5 = br7.R(parcel, i20);
                            break;
                        case '\b':
                            jV9 = br7.V(parcel, i20);
                            break;
                        case '\t':
                            zO8 = br7.O(parcel, i20);
                            break;
                        case '\n':
                            jV8 = br7.V(parcel, i20);
                            break;
                        case 11:
                            jV6 = br7.V(parcel, i20);
                            break;
                        case Protos.Attaches.Attach.PRESENT /* 12 */:
                            iU27 = br7.U(parcel, i20);
                            break;
                        case '\r':
                            iU28 = br7.U(parcel, i20);
                            break;
                        case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                            zO9 = br7.O(parcel, i20);
                            break;
                        case 16:
                            workSource = (WorkSource) br7.o(parcel, i20, WorkSource.CREATOR);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            ghgVar2 = (ghg) br7.o(parcel, i20, ghg.CREATOR);
                            break;
                    }
                }
                br7.s(parcel, iD020);
                return new LocationRequest(iU30, jV11, jV10, jV9, jV7, jV8, iU29, fR5, zO8, jV6, iU27, iU28, zO9, workSource, ghgVar2);
            case 22:
                int iD021 = br7.d0(parcel);
                List listR = LocationResult.b;
                while (parcel.dataPosition() < iD021) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        br7.X(parcel, i21);
                    } else {
                        listR = br7.r(parcel, i21, Location.CREATOR);
                    }
                }
                br7.s(parcel, iD021);
                return new LocationResult(listR);
            case 23:
                int iD022 = br7.d0(parcel);
                boolean zO10 = false;
                ArrayList arrayListR5 = null;
                boolean zO11 = false;
                while (parcel.dataPosition() < iD022) {
                    int i22 = parcel.readInt();
                    char c14 = (char) i22;
                    if (c14 == 1) {
                        arrayListR5 = br7.r(parcel, i22, LocationRequest.CREATOR);
                    } else if (c14 == 2) {
                        zO10 = br7.O(parcel, i22);
                    } else if (c14 != 3) {
                        br7.X(parcel, i22);
                    } else {
                        zO11 = br7.O(parcel, i22);
                    }
                }
                br7.s(parcel, iD022);
                return new qr7(arrayListR5, zO10, zO11);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int iD023 = br7.d0(parcel);
                Status status = null;
                sr7 sr7Var = null;
                while (parcel.dataPosition() < iD023) {
                    int i23 = parcel.readInt();
                    char c15 = (char) i23;
                    if (c15 == 1) {
                        status = (Status) br7.o(parcel, i23, Status.CREATOR);
                    } else if (c15 != 2) {
                        br7.X(parcel, i23);
                    } else {
                        sr7Var = (sr7) br7.o(parcel, i23, sr7.CREATOR);
                    }
                }
                br7.s(parcel, iD023);
                return new rr7(status, sr7Var);
            case 25:
                int iD024 = br7.d0(parcel);
                boolean zO12 = false;
                boolean zO13 = false;
                boolean zO14 = false;
                boolean zO15 = false;
                boolean zO16 = false;
                boolean zO17 = false;
                while (parcel.dataPosition() < iD024) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            zO12 = br7.O(parcel, i24);
                            break;
                        case 2:
                            zO13 = br7.O(parcel, i24);
                            break;
                        case 3:
                            zO14 = br7.O(parcel, i24);
                            break;
                        case 4:
                            zO15 = br7.O(parcel, i24);
                            break;
                        case 5:
                            zO16 = br7.O(parcel, i24);
                            break;
                        case 6:
                            zO17 = br7.O(parcel, i24);
                            break;
                        default:
                            br7.X(parcel, i24);
                            break;
                    }
                }
                br7.s(parcel, iD024);
                return new sr7(zO12, zO13, zO14, zO15, zO16, zO17);
            case 26:
                int iD025 = br7.d0(parcel);
                int iU31 = 0;
                boolean zO18 = false;
                boolean zO19 = false;
                int iU32 = 0;
                int iU33 = 0;
                while (parcel.dataPosition() < iD025) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        iU31 = br7.U(parcel, i25);
                    } else if (c16 == 2) {
                        zO18 = br7.O(parcel, i25);
                    } else if (c16 == 3) {
                        zO19 = br7.O(parcel, i25);
                    } else if (c16 == 4) {
                        iU32 = br7.U(parcel, i25);
                    } else if (c16 != 5) {
                        br7.X(parcel, i25);
                    } else {
                        iU33 = br7.U(parcel, i25);
                    }
                }
                br7.s(parcel, iD025);
                return new xmc(iU31, zO18, zO19, iU32, iU33);
            case 27:
                int iD026 = br7.d0(parcel);
                long jV12 = -1;
                long jV13 = -1;
                int iU34 = 1;
                int iU35 = 1;
                while (parcel.dataPosition() < iD026) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 1) {
                        iU34 = br7.U(parcel, i26);
                    } else if (c17 == 2) {
                        iU35 = br7.U(parcel, i26);
                    } else if (c17 == 3) {
                        jV12 = br7.V(parcel, i26);
                    } else if (c17 != 4) {
                        br7.X(parcel, i26);
                    } else {
                        jV13 = br7.V(parcel, i26);
                    }
                }
                br7.s(parcel, iD026);
                return new nfg(iU34, iU35, jV12, jV13);
            case 28:
                int iD027 = br7.d0(parcel);
                int iU36 = 0;
                IBinder iBinderT2 = null;
                Float fS3 = null;
                while (parcel.dataPosition() < iD027) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 2) {
                        iU36 = br7.U(parcel, i27);
                    } else if (c18 == 3) {
                        iBinderT2 = br7.T(parcel, i27);
                    } else if (c18 != 4) {
                        br7.X(parcel, i27);
                    } else {
                        fS3 = br7.S(parcel, i27);
                    }
                }
                br7.s(parcel, iD027);
                return new ez1(iU36, iBinderT2 != null ? new rxd(oy9.K0(iBinderT2)) : null, fS3);
            default:
                return new zeg((PendingIntent) parcel.readParcelable(hkc.class.getClassLoader()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new yqf[i];
            case 1:
                return new zqf[i];
            case 2:
                return new qe6[i];
            case 3:
                return new m33[i];
            case 4:
                return new moe[i];
            case 5:
                return new edg[i];
            case 6:
                return new GoogleSignInAccount[i];
            case 7:
                return new GoogleSignInOptions[i];
            case 8:
                return new leg[i];
            case 9:
                return new qeg[i];
            case 10:
                return new y99[i];
            case 11:
                return new veg[i];
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new weg[i];
            case 13:
                return new CameraPosition[i];
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new r43[i];
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new Scope[i];
            case 16:
                return new yd7[i];
            case LangUtils.HASH_SEED /* 17 */:
                return new LocationAvailability[i];
            case 18:
                return new GoogleMapOptions[i];
            case 19:
                return new mae[i];
            case 20:
                return new pae[i];
            case 21:
                return new LocationRequest[i];
            case 22:
                return new LocationResult[i];
            case 23:
                return new qr7[i];
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new rr7[i];
            case 25:
                return new sr7[i];
            case 26:
                return new xmc[i];
            case 27:
                return new nfg[i];
            case 28:
                return new ez1[i];
            default:
                return new hkc[i];
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.GetAnonymTokenByLinkRequest;
import ru.ok.android.externcalls.sdk.api.InternalIdResponse;
import ru.ok.android.externcalls.sdk.api.JoinByLinkResponse;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ig5 implements qj3, b7b, b66, al5, cc3, qa5, ra5, ru0, za7, w56, xs6, ys6, d7b {
    public final /* synthetic */ int a;

    public /* synthetic */ ig5(int i) {
        this.a = i;
    }

    @Override // defpackage.qa5
    public ka5[] a() {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ka5[]{new lm5()};
            default:
                return new ka5[]{new ps5()};
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                hm9.p("jg5", "failed to open file attach", (Throwable) obj);
                break;
            case 1:
                hm9.p("jg5", "onEvent DownloadCompleteEvent: failed", (Throwable) obj);
                break;
            case 4:
                hm9.p("jg5", "initFileSharingProgressDialog: error", (Throwable) obj);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                hm9.p("FrgAttachView", "fail", (Throwable) obj);
                break;
            case 18:
                hm9.p("ru.ok.messages.views.fragments.FrgProfilePhoto", "fail", (Throwable) obj);
                break;
            default:
                j10 j10Var = (j10) obj;
                j10Var.i = d20.o;
                j10Var.k = 0.0f;
                j10Var.p = 0L;
                j10Var.o = 0L;
                break;
        }
    }

    @Override // defpackage.d7b
    /* renamed from: apply */
    public boolean mo0apply(Object obj) {
        CancellationException cancellationException = iv6.l;
        return true;
    }

    @Override // defpackage.xs6, defpackage.ys6
    public boolean c(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
        }
        return false;
    }

    @Override // defpackage.al5
    public void e(long j) {
    }

    @Override // defpackage.cc3
    public Object f(bg4 bg4Var) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(bg4Var);
    }

    @Override // defpackage.ru0
    public su0 g(Bundle bundle) {
        switch (this.a) {
            case 16:
                my5 my5Var = new my5();
                if (bundle != null) {
                    ClassLoader classLoader = tu0.class.getClassLoader();
                    int i = maf.a;
                    bundle.setClassLoader(classLoader);
                }
                String string = bundle.getString(Integer.toString(0, 36));
                oy5 oy5Var = oy5.R0;
                String str = oy5Var.a;
                if (string == null) {
                    string = str;
                }
                my5Var.a = string;
                String string2 = bundle.getString(Integer.toString(1, 36));
                if (string2 == null) {
                    string2 = oy5Var.b;
                }
                my5Var.b = string2;
                String string3 = bundle.getString(Integer.toString(2, 36));
                if (string3 == null) {
                    string3 = oy5Var.c;
                }
                my5Var.c = string3;
                my5Var.d = bundle.getInt(Integer.toString(3, 36), oy5Var.o);
                my5Var.e = bundle.getInt(Integer.toString(4, 36), oy5Var.X);
                my5Var.f = bundle.getInt(Integer.toString(5, 36), oy5Var.Y);
                my5Var.g = bundle.getInt(Integer.toString(6, 36), oy5Var.Z);
                String string4 = bundle.getString(Integer.toString(7, 36));
                if (string4 == null) {
                    string4 = oy5Var.t0;
                }
                my5Var.h = string4;
                e99 e99Var = (e99) bundle.getParcelable(Integer.toString(8, 36));
                if (e99Var == null) {
                    e99Var = oy5Var.u0;
                }
                my5Var.i = e99Var;
                String string5 = bundle.getString(Integer.toString(9, 36));
                if (string5 == null) {
                    string5 = oy5Var.v0;
                }
                my5Var.j = string5;
                String string6 = bundle.getString(Integer.toString(10, 36));
                if (string6 == null) {
                    string6 = oy5Var.w0;
                }
                my5Var.k = string6;
                my5Var.l = bundle.getInt(Integer.toString(11, 36), oy5Var.x0);
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    String string7 = Integer.toString(12, 36);
                    String string8 = Integer.toString(i2, 36);
                    StringBuilder sb = new StringBuilder(rh4.e(rh4.e(1, string7), string8));
                    sb.append(string7);
                    sb.append("_");
                    sb.append(string8);
                    byte[] byteArray = bundle.getByteArray(sb.toString());
                    if (byteArray == null) {
                        my5Var.m = arrayList;
                        my5Var.n = (cr4) bundle.getParcelable(Integer.toString(13, 36));
                        my5Var.o = bundle.getLong(Integer.toString(14, 36), oy5Var.A0);
                        my5Var.p = bundle.getInt(Integer.toString(15, 36), oy5Var.B0);
                        my5Var.q = bundle.getInt(Integer.toString(16, 36), oy5Var.C0);
                        my5Var.r = bundle.getFloat(Integer.toString(17, 36), oy5Var.D0);
                        my5Var.s = bundle.getInt(Integer.toString(18, 36), oy5Var.E0);
                        my5Var.t = bundle.getFloat(Integer.toString(19, 36), oy5Var.F0);
                        my5Var.u = bundle.getByteArray(Integer.toString(20, 36));
                        my5Var.v = bundle.getInt(Integer.toString(21, 36), oy5Var.H0);
                        Bundle bundle2 = bundle.getBundle(Integer.toString(22, 36));
                        my5Var.w = bundle2 == null ? null : new h63(bundle2.getInt(Integer.toString(0, 36), -1), bundle2.getInt(Integer.toString(1, 36), -1), bundle2.getInt(Integer.toString(2, 36), -1), bundle2.getByteArray(Integer.toString(3, 36)));
                        my5Var.x = bundle.getInt(Integer.toString(23, 36), oy5Var.J0);
                        my5Var.y = bundle.getInt(Integer.toString(24, 36), oy5Var.K0);
                        my5Var.z = bundle.getInt(Integer.toString(25, 36), oy5Var.L0);
                        my5Var.A = bundle.getInt(Integer.toString(26, 36), oy5Var.M0);
                        my5Var.B = bundle.getInt(Integer.toString(27, 36), oy5Var.N0);
                        my5Var.C = bundle.getInt(Integer.toString(28, 36), oy5Var.O0);
                        my5Var.D = bundle.getInt(Integer.toString(29, 36), oy5Var.P0);
                        return new oy5(my5Var);
                    }
                    arrayList.add(byteArray);
                    i2++;
                }
            default:
                np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 0);
                return bundle.getBoolean(Integer.toString(1, 36), false) ? new oj6(bundle.getBoolean(Integer.toString(2, 36), false)) : new oj6();
        }
    }

    public String i(Context context) {
        switch (this.a) {
            case 7:
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
            case 8:
                ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                return applicationInfo2 != null ? String.valueOf(applicationInfo2.minSdkVersion) : "";
            case 9:
                return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "auto" : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
            default:
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
        }
    }

    @Override // defpackage.za7
    public Object parse(db7 db7Var) {
        switch (this.a) {
            case 19:
                return GetAnonymTokenByLinkRequest.lambda$static$0(db7Var);
            case 25:
                return InternalIdResponse.parse(db7Var);
            case 27:
                return JoinByLinkResponse.lambda$static$0(db7Var);
            case 28:
                return db7Var.H();
            default:
                return Boolean.valueOf(db7Var.a0());
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        return ((es8) obj).a.m(g20.u0);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 3:
                return ((es8) obj).a.z0.k(g20.u0);
            case 4:
            default:
                tn6 tn6Var = (tn6) obj;
                tn6Var.d();
                return zw6.j(br7.Z(new hme(16), tn6Var.T0.b));
            case 5:
                return new ff5(null, Collections.singletonList(new df5(3, 0, 0, 0, ((yg5) obj).c)));
        }
    }

    @Override // defpackage.ra5
    /* renamed from: a */
    public la5[] mo8a() {
        switch (this.a) {
            case 13:
                return new la5[]{new mm5()};
            default:
                return new la5[]{new qs5()};
        }
    }
}

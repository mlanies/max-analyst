package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* loaded from: classes.dex */
public final class qkg extends idg {
    public final Context d;

    public qkg(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 6);
        this.d = context;
    }

    @Override // defpackage.idg
    public final boolean J0(int i, Parcel parcel, Parcel parcel2) throws PackageManager.NameNotFoundException {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        int i2 = 19;
        Context context = this.d;
        if (i == 1) {
            K0();
            l8e l8eVarA = l8e.a(context);
            GoogleSignInAccount googleSignInAccountB = l8eVarA.b();
            GoogleSignInOptions googleSignInOptionsC = GoogleSignInOptions.v0;
            if (googleSignInAccountB != null) {
                googleSignInOptionsC = l8eVarA.c();
            }
            fp3.n(googleSignInOptionsC);
            reg regVar = new reg(context, w70.a, googleSignInOptionsC, new rq9());
            mdg mdgVar = regVar.s0;
            Context context2 = regVar.a;
            if (googleSignInAccountB != null) {
                boolean z = regVar.e() == 3;
                Object[] objArr = new Object[0];
                jn jnVar = nig.a;
                if (jnVar.b <= 3) {
                    jnVar.r("Revoking access", objArr);
                }
                String strE = l8e.a(context2).e("refreshToken");
                nig.a(context2);
                if (!z) {
                    tig tigVar = new tig(mdgVar, 1);
                    mdgVar.a(tigVar);
                    basePendingResult2 = tigVar;
                } else if (strE == null) {
                    jn jnVar2 = dhg.c;
                    Status status = new Status(4, null, null, null);
                    fp3.g("Status code must not be SUCCESS", !false);
                    BasePendingResult megVar = new meg(status);
                    megVar.S(status);
                    basePendingResult2 = megVar;
                } else {
                    dhg dhgVar = new dhg(strE);
                    new Thread(dhgVar).start();
                    basePendingResult2 = dhgVar.b;
                }
                basePendingResult2.O(new ueg(basePendingResult2, new qne(), new qx7(i2)));
            } else {
                boolean z2 = regVar.e() == 3;
                Object[] objArr2 = new Object[0];
                jn jnVar3 = nig.a;
                if (jnVar3.b <= 3) {
                    jnVar3.r("Signing out", objArr2);
                }
                nig.a(context2);
                if (z2) {
                    rjc rjcVar = Status.X;
                    BasePendingResult a2eVar = new a2e(mdgVar);
                    a2eVar.S(rjcVar);
                    basePendingResult = a2eVar;
                } else {
                    tig tigVar2 = new tig(mdgVar, 0);
                    mdgVar.a(tigVar2);
                    basePendingResult = tigVar2;
                }
                basePendingResult.O(new ueg(basePendingResult, new qne(), new qx7(i2)));
            }
        } else {
            if (i != 2) {
                return false;
            }
            K0();
            bkg.y(context).n();
        }
        return true;
    }

    public final void K0() throws PackageManager.NameNotFoundException {
        AppOpsManager appOpsManager;
        int callingUid = Binder.getCallingUid();
        Context context = this.d;
        bkg bkgVarA = a9g.a(context);
        bkgVarA.getClass();
        try {
            appOpsManager = (AppOpsManager) ((Context) bkgVarA.b).getSystemService("appops");
        } catch (PackageManager.NameNotFoundException | SecurityException unused) {
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(callingUid, "com.google.android.gms");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
        re6 re6VarN0 = re6.n0(context);
        re6VarN0.getClass();
        if (packageInfo != null) {
            if (re6.u0(packageInfo, false)) {
                return;
            }
            if (re6.u0(packageInfo, true)) {
                Context context2 = (Context) re6VarN0.b;
                if (!pe6.c) {
                    try {
                        PackageInfo packageInfo2 = ((Context) a9g.a(context2).b).getPackageManager().getPackageInfo("com.google.android.gms", 64);
                        re6.n0(context2);
                        if (packageInfo2 == null || re6.u0(packageInfo2, false) || !re6.u0(packageInfo2, true)) {
                            pe6.b = false;
                        } else {
                            pe6.b = true;
                        }
                        pe6.c = true;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        pe6.c = true;
                    } catch (Throwable th) {
                        pe6.c = true;
                        throw th;
                    }
                }
                if (pe6.b || !"user".equals(Build.TYPE)) {
                    return;
                }
            }
        }
        int callingUid2 = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid2);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }
}

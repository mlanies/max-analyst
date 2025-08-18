package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class oh9 extends ffe implements a66 {
    public Bundle X;
    public int Y;
    public final /* synthetic */ ju0 Z;
    public final /* synthetic */ uh9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh9(ju0 ju0Var, uh9 uh9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = ju0Var;
        this.s0 = uh9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((oh9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new oh9(this.Z, this.s0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object njcVar;
        Object objA;
        Bundle bundle;
        Long lF0;
        String str;
        tx3 tx3Var;
        boolean z;
        int i;
        Object objD;
        Uri uri;
        k8g k8gVar;
        List list;
        boolean z2;
        tx3 tx3Var2 = tx3.a;
        int i2 = this.Y;
        l20 l20Var = null;
        if (i2 == 0) {
            od2.a0(obj);
            ju0 ju0Var = this.Z;
            if (ju0Var instanceof yg9) {
                Bundle bundleG = dy7.g(new kpa("MediaMetadata.Extra.CHAT_ID", new Long(((yg9) ju0Var).d)), new kpa("MediaMetadata.Extra.MESSAGE_ID", new Long(((yg9) this.Z).e)), new kpa("MediaMetadata.Extra.ATTACH_ID", ((yg9) this.Z).f));
                uh9 uh9Var = this.s0;
                yg9 yg9Var = (yg9) this.Z;
                long j = yg9Var.e;
                String str2 = yg9Var.f;
                String str3 = yg9Var.g;
                eh9 eh9Var = new eh9(uh9Var, j, str2, str3);
                this.X = bundleG;
                this.Y = 1;
                try {
                    String queryParameter = Uri.parse(str3).getQueryParameter(ClientCookie.EXPIRES_ATTR);
                    njcVar = Boolean.valueOf(((hyc) uh9Var.e).n() >= ((queryParameter == null || (lF0 = dae.f0(queryParameter)) == null) ? Long.MAX_VALUE : lF0.longValue()));
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                Object obj2 = Boolean.FALSE;
                if (njcVar instanceof njc) {
                    njcVar = obj2;
                }
                boolean zBooleanValue = ((Boolean) njcVar).booleanValue();
                dn4 dn4VarD = ((q94) uh9Var.g.a().b).d(String.valueOf(eh9Var.b));
                objA = (w9e.C0(str3) || zBooleanValue || (dn4VarD != null && dn4VarD.b == 4)) ? eh9Var.a(this) : str3;
                if (objA == tx3Var2) {
                    return tx3Var2;
                }
                bundle = bundleG;
                str = (String) objA;
                if (str != null) {
                }
                int i3 = uh9.K;
                hm9.m0("uh9", "Invalid audio url: " + ((yg9) this.Z).g, new Object[0]);
                return e5f.a;
            }
            if (!(ju0Var instanceof zg9)) {
                throw new NoWhenBranchMatchedException();
            }
            uh9 uh9Var2 = this.s0;
            j47.T(uh9Var2.h, ((w9a) uh9Var2.b).c(), null, new ph9(uh9Var2, uh9Var2.c.d(((zg9) ju0Var).d).getAbsolutePath(), String.valueOf(((zg9) this.Z).d), ub8.o, null, null, null, null), 2);
        } else if (i2 == 1) {
            Bundle bundle2 = this.X;
            od2.a0(obj);
            bundle = bundle2;
            objA = obj;
            str = (String) objA;
            if (str != null || w9e.C0(str)) {
                int i32 = uh9.K;
                hm9.m0("uh9", "Invalid audio url: " + ((yg9) this.Z).g, new Object[0]);
                return e5f.a;
            }
            uh9 uh9Var3 = this.s0;
            String strValueOf = String.valueOf(((yg9) this.Z).e);
            ub8 ub8Var = ub8.c;
            yg9 yg9Var2 = (yg9) this.Z;
            String str4 = yg9Var2.h;
            String str5 = yg9Var2.i;
            int i4 = uh9.K;
            j47.T(uh9Var3.h, ((w9a) uh9Var3.b).c(), null, new ph9(uh9Var3, str, strValueOf, ub8Var, str5, str4, bundle, null), 2);
            uh9 uh9Var4 = this.s0;
            yg9 yg9Var3 = (yg9) this.Z;
            long j2 = yg9Var3.e;
            String str6 = yg9Var3.f;
            long j3 = yg9Var3.d;
            this.X = null;
            this.Y = 2;
            taa taaVar = uh9Var4.g;
            dn4 dn4VarD2 = ((q94) taaVar.a().b).d(String.valueOf(j2));
            if (dn4VarD2 == null || dn4VarD2.b != 3) {
                tx3Var = tx3Var2;
                z = false;
            } else {
                Uri.Builder builderBuildUpon = dn4VarD2.a.b.buildUpon();
                ub8.a.getClass();
                String string = builderBuildUpon.appendQueryParameter("MediaItemType", String.valueOf(1)).build().toString();
                long jA = dt3.a(((spd) taaVar.d.getValue()).i(string));
                spd spdVar = (spd) taaVar.d.getValue();
                synchronized (spdVar) {
                    mx0 mx0VarH = spdVar.c.h(string);
                    if (mx0VarH != null) {
                        tx3Var = tx3Var2;
                        z2 = mx0VarH.a(0L, jA) >= jA;
                    } else {
                        tx3Var = tx3Var2;
                    }
                }
                z = z2;
            }
            if (z) {
                cu8 cu8VarQ = uh9Var4.d.q(j2);
                if (cu8VarQ != null && (k8gVar = cu8VarQ.z0) != null && (list = (List) k8gVar.a) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (tpa.f(((l20) next).r, str6)) {
                            l20Var = next;
                            break;
                        }
                    }
                    l20Var = l20Var;
                }
                if (l20Var != null) {
                    d20 d20Var = l20Var.o;
                    d20 d20Var2 = d20.c;
                    if (d20Var != d20Var2) {
                        uh9Var4.d.u(cu8VarQ, str6, d20Var2);
                    }
                }
                objD = e5f.a;
            } else {
                Bundle bundleG2 = dy7.g(new kpa("MediaMetadata.Extra.CHAT_ID", new Long(j3)), new kpa("MediaMetadata.Extra.ATTACH_ID", str6), new kpa("MediaMetadata.Extra.MESSAGE_ID", new Long(j2)));
                taa taaVar2 = uh9Var4.g;
                tb8 tb8VarJ = uh9.j(str, String.valueOf(j2), ub8Var, null, null, bundleG2);
                taaVar2.getClass();
                ib8 ib8Var = tb8VarJ.b;
                if (ib8Var == null || (uri = ib8Var.a) == null) {
                    i = 2;
                } else {
                    String string2 = ay7.G(uri, tb8VarJ).toString();
                    ls5 ls5Var = zw6.b;
                    i = 2;
                    ((fx7) taaVar2.c.getValue()).a.getImmediate().mo20dispatch(hz4.a, new do9(taaVar2, 2, new vo4(tb8VarJ.a, uri, null, ffc.X, null, string2, null)));
                }
                objD = od2.F(od2.e(od2.g(new saa(taaVar2, tb8VarJ.a, null)), 1, i), ((w9a) uh9Var4.b).c()).d(new lh9(j2, str6, str, uh9Var4, j3), this);
                if (objD != tx3.a) {
                    objD = e5f.a;
                }
            }
            tx3 tx3Var3 = tx3Var;
            if (objD == tx3Var3) {
                return tx3Var3;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}

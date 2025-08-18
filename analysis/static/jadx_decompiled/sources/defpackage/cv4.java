package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cv4 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ dv4 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ CharSequence u0;
    public final /* synthetic */ boolean v0;
    public final /* synthetic */ List w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv4(dv4 dv4Var, long j, long j2, CharSequence charSequence, boolean z, List list, Continuation continuation) {
        super(2, continuation);
        this.Z = dv4Var;
        this.s0 = j;
        this.t0 = j2;
        this.u0 = charSequence;
        this.v0 = z;
        this.w0 = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cv4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        cv4 cv4Var = new cv4(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
        cv4Var.Y = obj;
        return cv4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.CharSequence] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objA;
        sx3 sx3Var;
        c20 c20VarI;
        String str;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        boolean z = true;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            hm9.G(sx3Var2.getClass().getName(), "Edit message.", null);
            r79 r79Var = (r79) this.Z.b.getValue();
            long j = this.s0;
            this.Y = sx3Var2;
            this.X = 1;
            objA = r79Var.a(j, this);
            if (objA == tx3Var) {
                return tx3Var;
            }
            sx3Var = sx3Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
            objA = obj;
        }
        cu8 cu8Var = (cu8) objA;
        e5f e5fVar = e5f.a;
        if (cu8Var == null) {
            return e5fVar;
        }
        List listB = ((dc6) this.Z.a.getValue()).b(this.u0, this.t0);
        CharSequence charSequence = this.u0;
        if (charSequence == null) {
            charSequence = "";
        }
        String string = charSequence.toString();
        this.Z.getClass();
        boolean z2 = false;
        if (cu8Var.C()) {
            c20 c20VarI2 = cu8Var.i();
            String str2 = c20VarI2 != null ? c20VarI2.b : null;
            if (str2 != null && str2.length() != 0 && (c20VarI = cu8Var.i()) != null && (str = c20VarI.b) != null) {
                String strK0 = w9e.K0(w9e.K0(str, "http://"), "https://");
                qk5 qk5VarE0 = l6d.e0(l6d.Z(new at(2, listB), new pz2(15)), new pz2(16));
                boolean z3 = w9e.p0(string, strK0, true) || w9e.p0(string, str, false);
                pk5 pk5Var = new pk5(qk5VarE0);
                while (true) {
                    if (!pk5Var.hasNext()) {
                        if (z3) {
                            break;
                        }
                    } else {
                        String str3 = (String) pk5Var.next();
                        if (eae.k0(str3, str, true) || eae.k0(str3, strK0, true) || w9e.K0(w9e.K0(str3, "http://"), "https://").equalsIgnoreCase(strK0)) {
                            break;
                        }
                    }
                }
                z = false;
                z2 = z;
            }
        }
        if (this.v0 || z2) {
            String name = sx3Var.getClass().getName();
            List list = this.w0;
            boolean z4 = this.v0;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, name, "Edit message. Attachments scenario, media size:" + (list != null ? new Integer(list.size()) : null) + ", media changed:" + z4, null);
            }
            List list2 = this.w0;
            if (list2 == null) {
                list2 = nz4.a;
            }
            l8d l8dVar = new l8d(cu8Var.b, this.t0, list2);
            l8dVar.m = string;
            l8dVar.n = listB;
            ((s8g) this.Z.d.getValue()).a(new m8d(l8dVar));
        } else {
            CharSequence charSequence2 = this.u0;
            if ((charSequence2 != null && charSequence2.length() != 0) || cu8Var.m(g20.c) || cu8Var.m(g20.o)) {
                hm9.n(sx3Var.getClass().getName(), "Edit message. Text scenario");
                dv4 dv4Var = this.Z;
                long j2 = this.t0;
                long j3 = this.s0;
                ?? r0 = this.u0;
                String str4 = r0 != 0 ? r0 : "";
                dv4Var.getClass();
                ((s8g) dv4Var.d.getValue()).a(new o8d(new n8d(j3, w9e.b1(str4).toString(), listB, j2)));
            }
        }
        return e5fVar;
    }
}

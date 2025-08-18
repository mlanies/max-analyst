package defpackage;

import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class kt6 implements dad {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kt6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dad
    public final void a(fad fadVar) {
        switch (this.a) {
            case 0:
                pt6 pt6Var = (pt6) this.b;
                if (pt6Var.c() == null) {
                    return;
                }
                kq0.e();
                cad cadVar = pt6Var.t;
                if (cadVar != null) {
                    cadVar.b();
                    pt6Var.t = null;
                }
                fw6 fw6Var = pt6Var.s;
                if (fw6Var != null) {
                    fw6Var.a();
                    pt6Var.s = null;
                }
                pt6Var.p.c();
                pt6Var.e();
                st6 st6Var = (st6) pt6Var.f;
                vb0 vb0Var = pt6Var.g;
                vb0Var.getClass();
                bad badVarF = pt6Var.F(st6Var, vb0Var);
                pt6Var.r = badVarF;
                Object[] objArr = {badVarF.c()};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                pt6Var.E(Collections.unmodifiableList(arrayList));
                pt6Var.q();
                return;
            case 1:
                fu6 fu6Var = (fu6) this.b;
                if (fu6Var.c() == null) {
                    return;
                }
                vje vjeVar = fu6Var.x;
                vjeVar.getClass();
                kq0.e();
                vjeVar.Y = true;
                yhc yhcVar = vjeVar.o;
                if (yhcVar != null) {
                    kq0.e();
                    if (!yhcVar.d.b.isDone()) {
                        ImageCaptureException imageCaptureException = new ImageCaptureException("The request is aborted silently and retried.", null);
                        kq0.e();
                        yhcVar.g = true;
                        bm7 bm7Var = yhcVar.i;
                        Objects.requireNonNull(bm7Var);
                        bm7Var.cancel(true);
                        yhcVar.e.d(imageCaptureException);
                        yhcVar.f.b(null);
                        vje vjeVar2 = yhcVar.b;
                        vjeVar2.getClass();
                        kq0.e();
                        vjeVar2.a.addFirst(yhcVar.a);
                        vjeVar2.c();
                    }
                }
                fu6Var.F(true);
                String strE = fu6Var.e();
                gu6 gu6Var = (gu6) fu6Var.f;
                vb0 vb0Var2 = fu6Var.g;
                vb0Var2.getClass();
                bad badVarG = fu6Var.G(strE, gu6Var, vb0Var2);
                fu6Var.v = badVarG;
                Object[] objArr2 = {badVarG.c()};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                fu6Var.E(Collections.unmodifiableList(arrayList2));
                fu6Var.q();
                vje vjeVar3 = fu6Var.x;
                vjeVar3.getClass();
                kq0.e();
                vjeVar3.Y = false;
                vjeVar3.c();
                return;
            case 2:
                x99 x99Var = (x99) this.b;
                x99Var.b = x99Var.h();
                tt1 tt1Var = (tt1) x99Var.X;
                if (tt1Var != null) {
                    fu1 fu1Var = tt1Var.b;
                    fu1Var.getClass();
                    try {
                        if (((Boolean) f8.g(new tt1(fu1Var, 0)).b.get()).booleanValue()) {
                            x99 x99Var2 = fu1Var.H0;
                            fad fadVar2 = (fad) x99Var2.b;
                            fu1Var.c.execute(new vt1(fu1Var, fu1.w(x99Var2), fadVar2, (w99) x99Var2.c, null, Collections.singletonList(q9f.Y), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                }
                return;
            case 3:
                h8b h8bVar = (h8b) this.b;
                if (h8bVar.c() == null) {
                    return;
                }
                h8bVar.H((i8b) h8bVar.f, h8bVar.g);
                h8bVar.q();
                return;
            case 4:
                Iterator it = ((ead) this.b).m.iterator();
                while (it.hasNext()) {
                    ((dad) it.next()).a(fadVar);
                }
                return;
            default:
                ((rdf) this.b).N();
                return;
        }
    }
}

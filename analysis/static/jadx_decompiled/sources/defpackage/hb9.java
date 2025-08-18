package defpackage;

import java.io.FileNotFoundException;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hb9 extends ffe implements a66 {
    public final /* synthetic */ zy X;
    public final /* synthetic */ t68 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb9(zy zyVar, t68 t68Var, Continuation continuation) {
        super(2, continuation);
        this.X = zyVar;
        this.Y = t68Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hb9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hb9(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        try {
            return this.X.d();
        } catch (FileNotFoundException unused) {
            String strC = this.Y.c();
            zy zyVar = this.X;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, strC, "file " + zyVar.c + " not found", null);
            }
            return null;
        } catch (InterruptedException e) {
            throw e;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            hm9.p(this.Y.c(), "load failed", th);
            return null;
        }
    }
}

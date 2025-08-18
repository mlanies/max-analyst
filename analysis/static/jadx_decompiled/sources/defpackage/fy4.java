package defpackage;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fy4 extends ffe implements a66 {
    public Bitmap X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ gy4 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy4(int i, gy4 gy4Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = i;
        this.t0 = gy4Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fy4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        fy4 fy4Var = new fy4(this.s0, this.t0, continuation);
        fy4Var.Z = obj;
        return fy4Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        Bitmap bitmap;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        if (i == 0) {
            od2.a0(obj);
            sx3Var = (sx3) this.Z;
            String name = sx3Var.getClass().getName();
            int i2 = this.s0;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, name, zr6.h(i2, "start extracting sprite by index: "), null);
            }
            Bitmap bitmapY = fp3.y(this.t0.b, this.s0);
            gy4 gy4Var = this.t0;
            Bitmap[] bitmapArr = (Bitmap[]) gy4Var.a.a;
            int i3 = this.s0;
            bitmapArr[i3] = bitmapY;
            kld kldVar = gy4Var.d;
            Integer num = new Integer(i3);
            this.Z = sx3Var;
            this.X = bitmapY;
            this.Y = 1;
            if (kldVar.a(num, this) == tx3Var) {
                return tx3Var;
            }
            bitmap = bitmapY;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = this.X;
            sx3Var = (sx3) this.Z;
            od2.a0(obj);
        }
        String name2 = sx3Var.getClass().getName();
        int i4 = this.s0;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.X, name2, "finish extracting sprite by index: " + i4 + " , sprite exist: " + (bitmap != null), null);
        }
        return e5f.a;
    }
}

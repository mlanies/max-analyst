package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wr extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zr Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr(zr zrVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.Y = zrVar;
        this.Z = z;
        this.s0 = z2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wr) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wr(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            nn7 nn7Var = (nn7) this.Y.C0.getValue();
            Context contextT = this.Y.t();
            boolean z = this.Z;
            this.X = 1;
            obj = j47.t0(((w9a) ((kke) nn7Var.c.getValue())).b(), new ln7(z, nn7Var, contextT, null), this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ze0 ze0Var = (ze0) entry.getKey();
            Drawable drawable = (Drawable) entry.getValue();
            Drawable drawableA = (Drawable) entry.getValue();
            if (drawableA instanceof rre) {
                drawableA = ((rre) drawableA).a(0.45f);
            }
            linkedHashMap.put(key, new c62(Boolean.FALSE, ze0Var, drawable, drawableA));
        }
        zr zrVar = this.Y;
        bc7[] bc7VarArr = zr.J0;
        String strL = tfg.l(((p7b) zrVar.u()).a, this.Z);
        ze0 ze0Var2 = strL != null ? new ze0(strL) : null;
        if (this.Z) {
            this.Y.w0 = linkedHashMap;
            this.Y.z0 = ze0Var2;
        } else {
            this.Y.x0 = linkedHashMap;
            this.Y.y0 = ze0Var2;
        }
        if (this.s0) {
            this.Y.x();
        }
        return e5f.a;
    }
}

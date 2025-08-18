package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class alb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ uj3 Y;
    public final /* synthetic */ blb Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alb(uj3 uj3Var, blb blbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = uj3Var;
        this.Z = blbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((alb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new alb(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [nz4] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object objSingletonList;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            oz4 oz4Var = oz4.a;
            uj3 uj3Var = this.Y;
            int[] iArr = uj3Var.a.c.v;
            int length = iArr.length;
            if (length != 0) {
                if (length != 1) {
                    objSingletonList = new ArrayList(iArr.length);
                    for (int i2 : iArr) {
                        objSingletonList.add(Integer.valueOf(i2));
                    }
                } else {
                    objSingletonList = Collections.singletonList(Integer.valueOf(iArr[0]));
                }
            } else {
                objSingletonList = nz4.a;
            }
            wgb wgbVar = new wgb(0L, uj3Var.n(), new bdb(oz4Var, 0, objSingletonList));
            adb adbVar = this.Z.a;
            this.X = 1;
            adbVar.getClass();
            if (ote.j((ilc) adbVar.a, new uh(adbVar, 18, wgbVar), this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}

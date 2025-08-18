package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zkb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nab Y;
    public final /* synthetic */ blb Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkb(nab nabVar, blb blbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = nabVar;
        this.Z = blbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zkb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zkb(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        wgb wgbVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        nab nabVar = this.Y;
        blb blbVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            wm3 wm3Var = nabVar.a;
            if (wm3Var == null) {
                return e5fVar;
            }
            ds3 ds3Var = (ds3) blbVar.b.getValue();
            List listSingletonList = Collections.singletonList(wm3Var);
            ol3 ol3Var = ol3.a;
            this.X = 1;
            if (ds3Var.e(listSingletonList, ol3Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        blbVar.getClass();
        wm3 wm3Var2 = nabVar.a;
        if (wm3Var2 != null) {
            Map map = nabVar.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), new jjc(((kjc) entry.getValue()).a));
            }
            wgbVar = new wgb(0L, wm3Var2.a, new bdb(linkedHashMap, 0, nabVar.c));
        } else {
            wgbVar = null;
        }
        if (wgbVar == null) {
            return e5fVar;
        }
        this.X = 2;
        adb adbVar = blbVar.a;
        adbVar.getClass();
        return ote.j((ilc) adbVar.a, new uh(adbVar, 18, wgbVar), this) == tx3Var ? tx3Var : e5fVar;
    }
}

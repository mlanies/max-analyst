package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zmd extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ and Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmd(and andVar, Continuation continuation) {
        super(2, continuation);
        this.Z = andVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zmd) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zmd zmdVar = new zmd(this.Z, continuation);
        zmdVar.Y = obj;
        return zmdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        and andVar = this.Z;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var2 = (sx3) this.Y;
            if (((f5a) andVar.b.getValue()).d() && j1e.z(sx3Var2)) {
                this.Y = sx3Var2;
                this.X = 1;
                Object objK = j1e.k(new xmd(andVar, null), this);
                if (objK == tx3Var) {
                    return tx3Var;
                }
                obj = objK;
                sx3Var = sx3Var2;
            }
            return e5fVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sx3Var = (sx3) this.Y;
        od2.a0(obj);
        List<umd> list = (List) obj;
        j1e.o(sx3Var);
        if (!list.isEmpty()) {
            Context context = andVar.a;
            context.getClass();
            if (Build.VERSION.SDK_INT <= 32) {
                ArrayList arrayList = new ArrayList(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((umd) it.next()).getClass();
                }
                list = arrayList;
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            for (umd umdVar : list) {
                umdVar.getClass();
                ShortcutInfo.Builder intents = new ShortcutInfo.Builder(umdVar.a, umdVar.b).setShortLabel(umdVar.d).setIntents(umdVar.c);
                IconCompat iconCompat = umdVar.f;
                if (iconCompat != null) {
                    intents.setIcon(cs6.d(iconCompat, umdVar.a));
                }
                if (!TextUtils.isEmpty(umdVar.e)) {
                    intents.setLongLabel(umdVar.e);
                }
                if (!TextUtils.isEmpty(null)) {
                    intents.setDisabledMessage(null);
                }
                xs xsVar = umdVar.g;
                if (xsVar != null) {
                    intents.setCategories(xsVar);
                }
                intents.setRank(0);
                int i2 = Build.VERSION.SDK_INT;
                xr7 xr7Var = umdVar.h;
                if (xr7Var != null) {
                    intents.setLocusId(xr7Var.b);
                }
                intents.setLongLived(umdVar.i);
                if (i2 >= 33) {
                    gu4.c(intents);
                }
                arrayList2.add(intents.build());
            }
            if (((ShortcutManager) context.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList2)) {
                wmd.u(context).getClass();
                wmd.u(context).getClass();
                Iterator it2 = ((ArrayList) wmd.t(context)).iterator();
                if (it2.hasNext()) {
                    au1.r(it2.next());
                    throw null;
                }
            }
        } else {
            andVar.c();
        }
        return e5fVar;
    }
}

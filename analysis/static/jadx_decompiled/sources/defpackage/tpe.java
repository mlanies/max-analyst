package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class tpe {
    public final Context a;
    public final zaa b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public tpe(kke kkeVar, Context context, zaa zaaVar) {
        this.a = context;
        this.b = zaaVar;
        od2.L(new zn5(new j31((w7c) qp4.u0.b(context).t0, new jp5(zaaVar.a, 0), new rpe(3, null), 4), new spe(this, null), 5), j1e.a(((w9a) kkeVar).a()));
    }

    public final TextPaint a(kqe kqeVar) {
        ConcurrentHashMap concurrentHashMap = this.c;
        Object obj = concurrentHashMap.get(kqeVar);
        Object obj2 = obj;
        if (obj == null) {
            TextPaint textPaint = new TextPaint();
            kqeVar.a(textPaint, this.a.getResources().getDisplayMetrics(), (du4) this.b.a.getValue());
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(kqeVar, textPaint);
            obj2 = textPaint;
            if (objPutIfAbsent != null) {
                obj2 = objPutIfAbsent;
            }
        }
        return (TextPaint) obj2;
    }
}

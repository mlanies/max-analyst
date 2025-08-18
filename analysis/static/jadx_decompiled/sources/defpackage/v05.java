package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes.dex */
public final /* synthetic */ class v05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ v05(m29 m29Var, List list) {
        this.a = 20;
        this.c = m29Var;
        this.o = list;
        this.b = null;
    }

    private final void a() {
        p9c p9cVar = (p9c) this.c;
        p9cVar.getClass();
        d9c d9cVarM = ((OneMeRoomDatabase) this.o).M();
        List list = (List) new e0a(qy9.j((List) this.b), new y98(p9cVar, 27, d9cVarM), 0).v().e();
        if (list.isEmpty()) {
            return;
        }
        d9cVarM.getClass();
        new sa3(2, new c9c(d9cVarM, list, 1)).a();
    }

    private final void b() {
        adc adcVar = (adc) this.c;
        see seeVar = adcVar.y;
        if (seeVar != null && !seeVar.a()) {
            adcVar.y.d();
        }
        see seeVar2 = (see) this.o;
        adcVar.y = seeVar2;
        bue bueVar = (bue) this.b;
        adcVar.z = bueVar;
        adcVar.h(seeVar2, bueVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r8.o() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c() {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v05.c():void");
    }

    private final void d() {
        vg8 vg8Var = (vg8) this.c;
        vg8Var.getClass();
        Objects.toString((qt1) this.o);
        vg8Var.c.remove((bm7) this.b);
    }

    private final void e() {
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((vlc) this.o).d().n(((cu8) it.next()).b, (iu8) this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x056b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v05.run():void");
    }

    public /* synthetic */ v05(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = obj3;
    }

    public /* synthetic */ v05(Object obj, Executor executor, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = executor;
        this.o = obj2;
    }

    public /* synthetic */ v05(List list, vlc vlcVar) {
        this.a = 28;
        iu8 iu8Var = iu8.Z;
        this.c = list;
        this.o = vlcVar;
        this.b = iu8Var;
    }
}

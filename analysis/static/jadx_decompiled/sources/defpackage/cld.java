package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class cld implements v1f {
    public final /* synthetic */ w1f a;
    public final /* synthetic */ List b;
    public final /* synthetic */ w1f c;
    public final /* synthetic */ List d;
    public final /* synthetic */ w1f e;
    public final /* synthetic */ List f;

    public cld(w1f w1fVar, ArrayList arrayList, w1f w1fVar2, ArrayList arrayList2, w1f w1fVar3, ArrayList arrayList3) {
        this.a = w1fVar;
        this.b = arrayList;
        this.c = w1fVar2;
        this.d = arrayList2;
        this.e = w1fVar3;
        this.f = arrayList3;
    }

    @Override // defpackage.v1f
    public final void a(w1f w1fVar) {
        List list;
        List list2;
        List list3;
        w1f w1fVar2 = this.a;
        if (w1fVar2 != null && (list3 = this.b) != null) {
            hm9.a0(w1fVar2, list3, null);
        }
        w1f w1fVar3 = this.c;
        if (w1fVar3 != null && (list2 = this.d) != null) {
            hm9.a0(w1fVar3, list2, null);
        }
        w1f w1fVar4 = this.e;
        if (w1fVar4 == null || (list = this.f) == null) {
            return;
        }
        hm9.a0(w1fVar4, list, null);
    }

    @Override // defpackage.v1f
    public final void b() {
    }

    @Override // defpackage.v1f
    public final void c(w1f w1fVar) {
    }

    @Override // defpackage.v1f
    public final void f() {
    }

    @Override // defpackage.v1f
    public final void g(w1f w1fVar) {
    }
}

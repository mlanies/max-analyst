package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kv implements ti9 {
    public final /* synthetic */ q0e a = r0e.a(Collections.singletonList(new uk6()));
    public final /* synthetic */ bx b;

    public kv(bx bxVar) {
        this.b = bxVar;
    }

    @Override // defpackage.si9, defpackage.on5
    public final Object a(Object obj, Continuation continuation) {
        this.a.setValue((List) obj);
        return e5f.a;
    }

    @Override // defpackage.gld
    public final List b() {
        return this.a.b();
    }

    @Override // defpackage.ti9
    public final boolean c(Object obj, Object obj2) {
        q0e q0eVar = this.a;
        q0eVar.getClass();
        return q0eVar.m((List) obj, (List) obj2);
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) throws Throwable {
        this.a.d(on5Var, continuation);
        return tx3.a;
    }

    @Override // defpackage.si9
    public final void f() {
        this.a.f();
        throw null;
    }

    @Override // defpackage.si9
    public final boolean g(Object obj) {
        this.a.setValue((List) obj);
        return true;
    }

    @Override // defpackage.ti9, defpackage.j0e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final List getValue() {
        return (List) this.a.getValue();
    }

    @Override // defpackage.si9
    public final j0e i() {
        return this.a.i();
    }

    @Override // defpackage.ti9
    public final void setValue(Object obj) {
        this.a.m(null, (List) obj);
    }
}

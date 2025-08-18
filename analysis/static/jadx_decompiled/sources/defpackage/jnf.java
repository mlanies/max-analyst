package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jnf extends ijc implements a66 {
    public final /* synthetic */ View X;
    public int c;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnf(View view, Continuation continuation) {
        super(2, continuation);
        this.X = view;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jnf) n((f6d) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        jnf jnfVar = new jnf(this.X, continuation);
        jnfVar.o = obj;
        return jnfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Object obj2;
        Object obj3 = tx3.a;
        int i = this.c;
        View view = this.X;
        if (i == 0) {
            od2.a0(obj);
            f6d f6dVar = (f6d) this.o;
            this.o = f6dVar;
            this.c = 1;
            f6dVar.c(view, this);
            return obj3;
        }
        Object obj4 = e5f.a;
        if (i == 1) {
            f6d f6dVar2 = (f6d) this.o;
            od2.a0(obj);
            if (view instanceof ViewGroup) {
                this.o = null;
                this.c = 2;
                f6dVar2.getClass();
                q1f q1fVar = new q1f(new u1(4, (ViewGroup) view));
                if (q1fVar.b.hasNext()) {
                    f6dVar2.c = q1fVar;
                    f6dVar2.a = 2;
                    f6dVar2.o = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj4;
    }
}

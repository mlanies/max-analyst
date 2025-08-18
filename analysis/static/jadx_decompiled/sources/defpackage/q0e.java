package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Concurrent_commonKt;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class q0e extends o3 implements ti9, vy1, y66 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(q0e.class, Object.class, "_state$volatile");
    public int X;
    private volatile /* synthetic */ Object _state$volatile;

    public q0e(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.si9, defpackage.on5
    public final Object a(Object obj, Continuation continuation) {
        setValue(obj);
        return e5f.a;
    }

    @Override // defpackage.gld
    public final List b() {
        return Collections.singletonList(getValue());
    }

    @Override // defpackage.ti9
    public final boolean c(Object obj, Object obj2) {
        if (obj == null) {
            obj = ay9.a;
        }
        if (obj2 == null) {
            obj2 = ay9.a;
        }
        return m(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0079, code lost:
    
        if (r12 != r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x008f, B:41:0x0095], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:41:0x0095, B:39:0x008f], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00bd, B:53:0x00d7, B:59:0x00e9, B:56:0x00e0, B:58:0x00e6, B:41:0x0095, B:45:0x009c, B:21:0x004d), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00bd, B:53:0x00d7, B:59:0x00e9, B:56:0x00e0, B:58:0x00e6, B:41:0x0095, B:45:0x009c, B:21:0x004d), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x0079, B:33:0x0081, B:36:0x0088, B:37:0x008c, B:39:0x008f, B:49:0x00b0, B:52:0x00bd, B:53:0x00d7, B:59:0x00e9, B:56:0x00e0, B:58:0x00e6, B:41:0x0095, B:45:0x009c, B:21:0x004d), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [s0e] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p3] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [s0e] */
    /* JADX WARN: Type inference failed for: r2v7, types: [s0e] */
    /* JADX WARN: Type inference failed for: r2v8, types: [s0e] */
    /* JADX WARN: Type inference failed for: r8v1, types: [o3] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [q0e] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, q0e] */
    /* JADX WARN: Type inference failed for: r8v7, types: [q0e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00bc -> B:31:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.mn5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.on5 r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0e.d(on5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.y66
    public final mn5 e(lx3 lx3Var, int i, int i2) {
        Symbol symbol = r0e.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? lld.e(this, lx3Var, i, i2) : this;
    }

    @Override // defpackage.si9
    public final void f() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.si9
    public final boolean g(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // defpackage.ti9, defpackage.j0e
    public final Object getValue() {
        Symbol symbol = ay9.a;
        Object obj = Y.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.o3
    public final p3 j() {
        return new s0e();
    }

    @Override // defpackage.o3
    public final p3[] k() {
        return new s0e[2];
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        p3[] p3VarArr;
        Symbol symbol;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !tpa.f(obj3, obj)) {
                return false;
            }
            if (tpa.f(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.X;
            if ((i2 & 1) != 0) {
                this.X = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.X = i3;
            p3[] p3VarArr2 = this.a;
            while (true) {
                s0e[] s0eVarArr = (s0e[]) p3VarArr2;
                if (s0eVarArr != null) {
                    for (s0e s0eVar : s0eVarArr) {
                        if (s0eVar != null) {
                            AtomicReference atomicReference = s0eVar.a;
                            while (true) {
                                Object value = Concurrent_commonKt.getValue(atomicReference);
                                if (value != null && value != (symbol = r0e.b)) {
                                    Symbol symbol2 = r0e.a;
                                    if (value != symbol2) {
                                        while (!atomicReference.compareAndSet(value, symbol2)) {
                                            if (atomicReference.get() != value) {
                                                break;
                                            }
                                        }
                                        ((sy1) value).resumeWith(e5f.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(value, symbol)) {
                                        if (atomicReference.get() != value) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.X;
                    if (i == i3) {
                        this.X = i3 + 1;
                        return true;
                    }
                    p3VarArr = this.a;
                }
                p3VarArr2 = p3VarArr;
                i3 = i;
            }
        }
    }

    @Override // defpackage.ti9
    public final void setValue(Object obj) {
        if (obj == null) {
            obj = ay9.a;
        }
        m(null, obj);
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class tt0 implements irf {
    public Object a = bu0.p;
    public sy1 b;
    public final /* synthetic */ zt0 c;

    public tt0(zt0 zt0Var) {
        this.c = zt0Var;
    }

    @Override // defpackage.irf
    public final void a(Segment segment, int i) {
        sy1 sy1Var = this.b;
        if (sy1Var != null) {
            sy1Var.a(segment, i);
        }
    }

    public final Object b(Continuation continuation) throws Throwable {
        j42 j42Var;
        Boolean bool;
        j42 j42Var2;
        Object obj = this.a;
        boolean z = true;
        if (obj == bu0.p || obj == bu0.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zt0.t0;
            zt0 zt0Var = this.c;
            j42 j42Var3 = (j42) atomicReferenceFieldUpdater.get(zt0Var);
            while (true) {
                if (zt0Var.x()) {
                    this.a = bu0.l;
                    Throwable thS = zt0Var.s();
                    if (thS != null) {
                        throw StackTraceRecoveryKt.recoverStackTrace(thS);
                    }
                    z = false;
                } else {
                    long andIncrement = zt0.X.getAndIncrement(zt0Var);
                    long j = bu0.b;
                    long j2 = andIncrement / j;
                    int i = (int) (andIncrement % j);
                    if (j42Var3.id != j2) {
                        j42 j42VarR = zt0Var.r(j2, j42Var3);
                        if (j42VarR == null) {
                            continue;
                        } else {
                            j42Var = j42VarR;
                        }
                    } else {
                        j42Var = j42Var3;
                    }
                    Object objH = zt0Var.H(j42Var, i, andIncrement, null);
                    Symbol symbol = bu0.m;
                    if (objH == symbol) {
                        throw new IllegalStateException("unreachable".toString());
                    }
                    Symbol symbol2 = bu0.o;
                    if (objH == symbol2) {
                        if (andIncrement < zt0Var.u()) {
                            j42Var.cleanPrev();
                        }
                        j42Var3 = j42Var;
                    } else {
                        if (objH == bu0.n) {
                            zt0 zt0Var2 = this.c;
                            sy1 sy1VarO = nu0.o(v3c.u(continuation));
                            try {
                                this.b = sy1VarO;
                                Object objH2 = zt0Var2.H(j42Var, i, andIncrement, this);
                                if (objH2 == symbol) {
                                    a(j42Var, i);
                                } else {
                                    rt0 rt0Var = null;
                                    m56 m56Var = zt0Var2.b;
                                    if (objH2 == symbol2) {
                                        if (andIncrement < zt0Var2.u()) {
                                            j42Var.cleanPrev();
                                        }
                                        j42 j42Var4 = (j42) zt0.t0.get(zt0Var2);
                                        while (true) {
                                            if (zt0Var2.x()) {
                                                sy1 sy1Var = this.b;
                                                this.b = null;
                                                this.a = bu0.l;
                                                Throwable thS2 = zt0Var.s();
                                                if (thS2 == null) {
                                                    sy1Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    sy1Var.resumeWith(new njc(thS2));
                                                }
                                            } else {
                                                long andIncrement2 = zt0.X.getAndIncrement(zt0Var2);
                                                long j3 = bu0.b;
                                                long j4 = andIncrement2 / j3;
                                                int i2 = (int) (andIncrement2 % j3);
                                                if (j42Var4.id != j4) {
                                                    j42 j42VarR2 = zt0Var2.r(j4, j42Var4);
                                                    if (j42VarR2 != null) {
                                                        j42Var2 = j42VarR2;
                                                    }
                                                } else {
                                                    j42Var2 = j42Var4;
                                                }
                                                Object objH3 = zt0Var2.H(j42Var2, i2, andIncrement2, this);
                                                if (objH3 == bu0.m) {
                                                    a(j42Var2, i2);
                                                    break;
                                                }
                                                if (objH3 == bu0.o) {
                                                    if (andIncrement2 < zt0Var2.u()) {
                                                        j42Var2.cleanPrev();
                                                    }
                                                    j42Var4 = j42Var2;
                                                } else {
                                                    if (objH3 == bu0.n) {
                                                        throw new IllegalStateException("unexpected".toString());
                                                    }
                                                    j42Var2.cleanPrev();
                                                    this.a = objH3;
                                                    this.b = null;
                                                    bool = Boolean.TRUE;
                                                    if (m56Var != null) {
                                                        rt0Var = new rt0(m56Var, 0, objH3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        j42Var.cleanPrev();
                                        this.a = objH2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                        if (m56Var != null) {
                                            rt0Var = new rt0(m56Var, 0, objH2);
                                        }
                                    }
                                    sy1VarO.e(bool, rt0Var);
                                }
                                return sy1VarO.m();
                            } catch (Throwable th) {
                                sy1VarO.u();
                                throw th;
                            }
                        }
                        j42Var.cleanPrev();
                        this.a = objH;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() throws Throwable {
        Object obj = this.a;
        Symbol symbol = bu0.p;
        if (obj == symbol) {
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
        this.a = symbol;
        if (obj != bu0.l) {
            return obj;
        }
        Throwable thS = this.c.s();
        if (thS == null) {
            thS = new ClosedReceiveChannelException("Channel was closed");
        }
        throw StackTraceRecoveryKt.recoverStackTrace(thS);
    }
}

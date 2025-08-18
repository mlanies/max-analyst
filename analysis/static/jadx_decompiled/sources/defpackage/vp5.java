package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.rx.TamTamObservables$TamObservableException;

/* loaded from: classes.dex */
public final class vp5 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp5(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.s0 = obj;
        this.t0 = obj2;
    }

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        switch (this.X) {
            case 0:
                vp5 vp5Var = new vp5((a66) this.t0, (Continuation) obj3, 0);
                vp5Var.Z = (on5) obj;
                vp5Var.s0 = obj2;
                break;
            case 1:
                vp5 vp5Var2 = new vp5((Continuation) obj3, (e66) this.t0, 1);
                vp5Var2.Z = (on5) obj;
                vp5Var2.s0 = (Object[]) obj2;
                break;
            case 2:
                vp5 vp5Var3 = new vp5((Continuation) obj3, (g66) this.t0, 2);
                vp5Var3.Z = (on5) obj;
                vp5Var3.s0 = (Object[]) obj2;
                break;
            case 3:
                vp5 vp5Var4 = new vp5((Continuation) obj3, (h66) this.t0, 3);
                vp5Var4.Z = (on5) obj;
                vp5Var4.s0 = (Object[]) obj2;
                break;
            case 4:
                vp5 vp5Var5 = new vp5((c66) this.t0, (Continuation) obj3, 4);
                vp5Var5.Z = (on5) obj;
                vp5Var5.s0 = (Object[]) obj2;
                break;
            case 5:
                vp5 vp5Var6 = new vp5((vj7) this.t0, (Continuation) obj3, 5);
                vp5Var6.Z = (on5) obj;
                vp5Var6.s0 = (Throwable) obj2;
                break;
            case 6:
                vp5 vp5Var7 = new vp5((bp8) this.t0, (Continuation) obj3, 6);
                vp5Var7.Z = (List) obj;
                vp5Var7.s0 = (yn8) obj2;
                break;
            case 7:
                vp5 vp5Var8 = new vp5((Continuation) obj3, (bp8) this.t0, 7);
                vp5Var8.Z = (on5) obj;
                vp5Var8.s0 = obj2;
                break;
            case 8:
                vp5 vp5Var9 = new vp5((Continuation) obj3, (ltd) this.t0, 8);
                vp5Var9.Z = (on5) obj;
                vp5Var9.s0 = obj2;
                break;
            case 9:
                vp5 vp5Var10 = new vp5((cge) this.s0, (d7f) this.t0, (Continuation) obj3, 9);
                vp5Var10.Z = (Throwable) obj2;
                vp5Var10.o(e5f.a);
                break;
            case 10:
                vp5 vp5Var11 = new vp5((cge) this.s0, (v6f) this.t0, (Continuation) obj3, 10);
                vp5Var11.Z = (Throwable) obj2;
                vp5Var11.o(e5f.a);
                break;
            default:
                vp5 vp5Var12 = new vp5((ige) this.s0, (iy8) this.t0, (Continuation) obj3, 11);
                vp5Var12.Z = (Throwable) obj2;
                vp5Var12.o(e5f.a);
                break;
        }
        return tx3.a;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        on5 on5Var;
        on5 on5Var2;
        on5 on5Var3;
        on5 on5Var4;
        on5 on5Var5;
        Throwable th;
        switch (this.X) {
            case 0:
                tx3 tx3Var = tx3.a;
                int i = this.Y;
                if (i == 0) {
                    od2.a0(obj);
                    on5Var = (on5) this.Z;
                    Object obj2 = this.s0;
                    this.Z = on5Var;
                    this.Y = 1;
                    obj = ((a66) this.t0).invoke(obj2, this);
                    if (obj == tx3Var) {
                        return tx3Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od2.a0(obj);
                        return e5f.a;
                    }
                    on5Var = (on5) this.Z;
                    od2.a0(obj);
                }
                this.Z = null;
                this.Y = 2;
                if (on5Var.a(obj, this) == tx3Var) {
                    return tx3Var;
                }
                return e5f.a;
            case 1:
                tx3 tx3Var2 = tx3.a;
                int i2 = this.Y;
                if (i2 == 0) {
                    od2.a0(obj);
                    on5Var2 = (on5) this.Z;
                    Object[] objArr = (Object[]) this.s0;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    this.Z = on5Var2;
                    this.Y = 1;
                    obj = ((e66) this.t0).h(obj3, obj4, obj5, this);
                    if (obj == tx3Var2) {
                        return tx3Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od2.a0(obj);
                        return e5f.a;
                    }
                    on5Var2 = (on5) this.Z;
                    od2.a0(obj);
                }
                this.Z = null;
                this.Y = 2;
                if (on5Var2.a(obj, this) == tx3Var2) {
                    return tx3Var2;
                }
                return e5f.a;
            case 2:
                tx3 tx3Var3 = tx3.a;
                int i3 = this.Y;
                if (i3 == 0) {
                    od2.a0(obj);
                    on5Var3 = (on5) this.Z;
                    Object[] objArr2 = (Object[]) this.s0;
                    Object obj6 = objArr2[0];
                    Object obj7 = objArr2[1];
                    Object obj8 = objArr2[2];
                    Object obj9 = objArr2[3];
                    this.Z = on5Var3;
                    this.Y = 1;
                    obj = ((g66) this.t0).m(obj6, obj7, obj8, obj9, this);
                    if (obj == tx3Var3) {
                        return tx3Var3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od2.a0(obj);
                        return e5f.a;
                    }
                    on5Var3 = (on5) this.Z;
                    od2.a0(obj);
                }
                this.Z = null;
                this.Y = 2;
                if (on5Var3.a(obj, this) == tx3Var3) {
                    return tx3Var3;
                }
                return e5f.a;
            case 3:
                tx3 tx3Var4 = tx3.a;
                int i4 = this.Y;
                e5f e5fVar = e5f.a;
                if (i4 == 0) {
                    od2.a0(obj);
                    on5Var4 = (on5) this.Z;
                    Object[] objArr3 = (Object[]) this.s0;
                    Object obj10 = objArr3[0];
                    Object obj11 = objArr3[1];
                    Object obj12 = objArr3[2];
                    Object obj13 = objArr3[3];
                    Object obj14 = objArr3[4];
                    this.Z = on5Var4;
                    this.Y = 1;
                    ((h66) this.t0).k(obj10, obj11, obj12, obj13, obj14, this);
                    if (e5fVar == tx3Var4) {
                        return tx3Var4;
                    }
                    obj = e5fVar;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od2.a0(obj);
                        return e5fVar;
                    }
                    on5Var4 = (on5) this.Z;
                    od2.a0(obj);
                }
                this.Z = null;
                this.Y = 2;
                if (on5Var4.a(obj, this) == tx3Var4) {
                    return tx3Var4;
                }
                return e5fVar;
            case 4:
                tx3 tx3Var5 = tx3.a;
                int i5 = this.Y;
                if (i5 == 0) {
                    od2.a0(obj);
                    on5Var5 = (on5) this.Z;
                    Object[] objArr4 = (Object[]) this.s0;
                    Object obj15 = objArr4[0];
                    Object obj16 = objArr4[1];
                    this.Z = on5Var5;
                    this.Y = 1;
                    obj = ((c66) this.t0).invoke(obj15, obj16, this);
                    if (obj == tx3Var5) {
                        return tx3Var5;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od2.a0(obj);
                        return e5f.a;
                    }
                    on5Var5 = (on5) this.Z;
                    od2.a0(obj);
                }
                this.Z = null;
                this.Y = 2;
                if (on5Var5.a(obj, this) == tx3Var5) {
                    return tx3Var5;
                }
                return e5f.a;
            case 5:
                tx3 tx3Var6 = tx3.a;
                int i6 = this.Y;
                if (i6 == 0) {
                    od2.a0(obj);
                    on5 on5Var6 = (on5) this.Z;
                    Throwable th2 = (Throwable) this.s0;
                    if (!(th2 instanceof CancellationException)) {
                        hm9.p(((vj7) this.t0).r, "fail", th2);
                        oi7 oi7Var = oi7.a;
                        this.Z = null;
                        this.Y = 1;
                        if (on5Var6.a(oi7Var, this) == tx3Var6) {
                            return tx3Var6;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
            case 6:
                tx3 tx3Var7 = tx3.a;
                int i7 = this.Y;
                if (i7 == 0) {
                    od2.a0(obj);
                    List list = (List) this.Z;
                    yn8 yn8Var = (yn8) this.s0;
                    this.Z = null;
                    this.Y = 1;
                    obj = bp8.q(yn8Var, (bp8) this.t0, list, this);
                    if (obj == tx3Var7) {
                        return tx3Var7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return x53.D0((Iterable) obj);
            case 7:
                tx3 tx3Var8 = tx3.a;
                int i8 = this.Y;
                if (i8 == 0) {
                    od2.a0(obj);
                    on5 on5Var7 = (on5) this.Z;
                    List list2 = (List) this.s0;
                    bp8 bp8Var = (bp8) this.t0;
                    mn5 mn5VarU = od2.u(new zn5(new j31(list2, new v7c(bp8Var.Y.a), new vp5(bp8Var, (Continuation) null, 6)), new vo8(list2, null)), 200L);
                    this.Y = 1;
                    if (od2.y(mn5VarU, on5Var7, this) == tx3Var8) {
                        return tx3Var8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
            case 8:
                tx3 tx3Var9 = tx3.a;
                int i9 = this.Y;
                if (i9 == 0) {
                    od2.a0(obj);
                    on5 on5Var8 = (on5) this.Z;
                    ((Number) this.s0).intValue();
                    ltd ltdVar = (ltd) this.t0;
                    mn5 mn5VarF = od2.F(od2.x(new j31(new t03(((jz2) ((iy2) ltdVar.e.getValue())).m(ltdVar.a), 11), new t03(((ds3) ltdVar.f.getValue()).c(ltdVar.d), 11), new m1d(ltdVar, (Continuation) null, 2), 4)), ((w9a) ltdVar.c).b());
                    this.Y = 1;
                    if (od2.y(mn5VarF, on5Var8, this) == tx3Var9) {
                        return tx3Var9;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od2.a0(obj);
                }
                return e5f.a;
            case 9:
                tx3 tx3Var10 = tx3.a;
                int i10 = this.Y;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th3 = (Throwable) this.Z;
                    od2.a0(obj);
                    throw th3;
                }
                od2.a0(obj);
                Throwable th4 = (Throwable) this.Z;
                cge cgeVar = (cge) this.s0;
                hm9.p(cgeVar.b, "Got error during upload", th4);
                cgeVar.a.e(th4);
                this.Z = th4;
                this.Y = 1;
                if (cgeVar.h((d7f) this.t0, this) == tx3Var10) {
                    return tx3Var10;
                }
                throw th4;
            case 10:
                tx3 tx3Var11 = tx3.a;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th5 = (Throwable) this.Z;
                    od2.a0(obj);
                    throw th5;
                }
                od2.a0(obj);
                Throwable th6 = (Throwable) this.Z;
                boolean z = th6 instanceof HttpUrlExpiredException;
                v6f v6fVar = (v6f) this.t0;
                cge cgeVar2 = (cge) this.s0;
                if (!z) {
                    ((t33) ((q33) cgeVar2.d.getValue())).getClass();
                    TimeUnit timeUnit = TimeUnit.DAYS;
                    if (timeUnit.toMillis(7L) <= 0) {
                        throw th6;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - v6fVar.i;
                    ((t33) ((q33) cgeVar2.d.getValue())).getClass();
                    if (jCurrentTimeMillis > timeUnit.toMillis(7L)) {
                        throw new TamTamObservables$TamObservableException("timeout reached", th6);
                    }
                    throw th6;
                }
                this.Z = th6;
                this.Y = 1;
                hm9.m0(cgeVar2.b, "Url is expired, reset it in repository", new Object[0]);
                u6f u6fVarB = v6fVar.b();
                u6fVarB.d = null;
                u6fVarB.e = 0.0f;
                Object objF = cgeVar2.f(new v6f(u6fVarB), this);
                if (objF != tx3Var11) {
                    objF = e5f.a;
                }
                if (objF == tx3Var11) {
                    return tx3Var11;
                }
                throw th6;
            default:
                tx3 tx3Var12 = tx3.a;
                int i12 = this.Y;
                if (i12 == 0) {
                    od2.a0(obj);
                    Throwable th7 = (Throwable) this.Z;
                    ige igeVar = (ige) this.s0;
                    igeVar.getClass();
                    if (!(th7 instanceof TamErrorException) || !"invalid.token".equals(((TamErrorException) th7).a.b)) {
                        throw th7;
                    }
                    d7f d7fVarA = ige.a(igeVar, (iy8) this.t0);
                    cge cgeVar3 = (cge) igeVar.b.getValue();
                    this.Z = th7;
                    this.Y = 1;
                    if (cgeVar3.d(d7fVarA, this) == tx3Var12) {
                        return tx3Var12;
                    }
                    th = th7;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) this.Z;
                    od2.a0(obj);
                }
                throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp5(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.t0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp5(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.X = i;
        this.t0 = obj;
    }
}

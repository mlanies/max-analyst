package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class r69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        r69 r69Var = (r69) n((fi9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        r69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        r69 r69Var = new r69(continuation, this.Y);
        r69Var.X = obj;
        return r69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        long[] jArr;
        long[] jArr2;
        Object[] objArr;
        int i;
        long[] jArr3;
        long[] jArr4;
        Object[] objArr2;
        int i2;
        int i3 = 1;
        od2.a0(obj);
        fi9 fi9Var = (fi9) this.X;
        MessagesListWidget messagesListWidget = this.Y;
        bc7[] bc7VarArr = MessagesListWidget.X0;
        fn5 fn5Var = (fn5) messagesListWidget.B0.getValue();
        EndlessRecyclerView2 endlessRecyclerView2U0 = this.Y.u0();
        if (!fn5Var.s0) {
            fn5Var.s0 = true;
            endlessRecyclerView2U0.j(fn5Var);
            fn5Var.t0 = endlessRecyclerView2U0;
        }
        fn5 fn5Var2 = (fn5) this.Y.B0.getValue();
        fn5Var2.getClass();
        long[] jArr5 = fi9Var.b;
        Object[] objArr3 = fi9Var.c;
        long[] jArr6 = fi9Var.a;
        int length = jArr6.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr6[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            jArr3 = jArr6;
                            long j2 = jArr5[i8];
                            ow8 ow8Var = (ow8) objArr3[i8];
                            fi9 fi9Var2 = fn5Var2.c;
                            if (fi9Var2.d(j2) == null) {
                                g5a g5aVar = new g5a(fn5Var2.a);
                                String str = ow8Var.b;
                                jArr4 = jArr5;
                                objArr2 = objArr3;
                                Long lValueOf = Long.valueOf(ow8Var.a);
                                CharSequence charSequence = ow8Var.c;
                                if (charSequence == null) {
                                    charSequence = "";
                                }
                                g5aVar.b(oag.a(charSequence, lValueOf), str);
                                int i9 = fn5Var2.X;
                                g5aVar.setBounds(0, 0, i9, i9);
                                g5aVar.setCallback((en5) fn5Var2.u0.getValue());
                                fi9Var2.g(j2, g5aVar);
                            } else {
                                jArr4 = jArr5;
                                objArr2 = objArr3;
                            }
                            i2 = 8;
                        } else {
                            jArr3 = jArr6;
                            jArr4 = jArr5;
                            objArr2 = objArr3;
                            i2 = i5;
                        }
                        j >>= i2;
                        i7++;
                        i5 = i2;
                        i3 = 1;
                        jArr6 = jArr3;
                        jArr5 = jArr4;
                        objArr3 = objArr2;
                    }
                    jArr = jArr6;
                    jArr2 = jArr5;
                    objArr = objArr3;
                    i = i3;
                    if (i6 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    jArr2 = jArr5;
                    objArr = objArr3;
                    i = i3;
                }
                if (i4 == length) {
                    break;
                }
                i4 += i;
                i3 = i;
                jArr6 = jArr;
                jArr5 = jArr2;
                objArr3 = objArr;
            }
        }
        String name = fn5.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, zr6.h(fn5Var2.c.e, "avatars.size = "), null);
        }
        this.Y.u0().Y();
        return e5f.a;
    }
}

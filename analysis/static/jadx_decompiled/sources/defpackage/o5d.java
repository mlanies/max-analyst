package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class o5d extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ boolean s0;
    public final /* synthetic */ CharSequence t0;
    public final /* synthetic */ p5d u0;
    public final /* synthetic */ long v0;
    public final /* synthetic */ Long w0;
    public final /* synthetic */ cz5 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5d(List list, boolean z, CharSequence charSequence, p5d p5dVar, long j, Long l, cz5 cz5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.s0 = z;
        this.t0 = charSequence;
        this.u0 = p5dVar;
        this.v0 = j;
        this.w0 = l;
        this.x0 = cz5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((o5d) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new o5d(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, this.x0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.Queue] */
    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        q7b q7bVar;
        Object objA;
        LinkedList linkedList;
        tx3 tx3Var;
        int iQ;
        String string;
        Object objB;
        int i = 2;
        tx3 tx3Var2 = tx3.a;
        int i2 = this.Y;
        CharSequence charSequence = this.t0;
        long j = this.v0;
        p5d p5dVar = this.u0;
        if (i2 == 0) {
            od2.a0(obj);
            List list = this.Z;
            hm9.G("SendMessageWithMediaUseCase", "Sending messages with media. Media count " + list.size(), null);
            q7bVar = new q7b(list, !this.s0 && list.size() > 1, charSequence);
            x19 x19Var = (x19) p5dVar.e.getValue();
            this.X = q7bVar;
            this.Y = 1;
            objA = x19Var.a(j, this.w0, this);
            if (objA == tx3Var2) {
                return tx3Var2;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r0 = (Queue) this.X;
                od2.a0(obj);
                linkedList = r0;
                objB = obj;
                linkedList.addAll((List) objB);
                ((s8g) p5dVar.b.getValue()).a(new h9d(new h8d(j, linkedList, i)));
                return e5f.a;
            }
            q7b q7bVar2 = (q7b) this.X;
            od2.a0(obj);
            q7bVar = q7bVar2;
            objA = obj;
        }
        bw8 bw8Var = (bw8) objA;
        List listB = ((dc6) p5dVar.f.getValue()).b(charSequence, j);
        linkedList = new LinkedList();
        zm8 zm8Var = (zm8) p5dVar.c.getValue();
        zm8Var.getClass();
        if (q7bVar.b) {
            qyc qycVar = (qyc) zm8Var.a;
            qycVar.getClass();
            tx3Var = tx3Var2;
            iQ = (int) qycVar.q(PmsKey.f62maxattachcount, 12);
        } else {
            tx3Var = tx3Var2;
            iQ = 1;
        }
        List list2 = q7bVar.a;
        int size = list2 != null ? list2.size() : 0;
        if (size == 0 && !oag.t(q7bVar.c)) {
            hm9.p("SendMessageWithMediaUseCase", "Unexpected empty media list", null);
        } else if (size > 0) {
            int i3 = 0;
            boolean z = false;
            while (i3 < size) {
                int i4 = i3 + iQ;
                try {
                    d9d d9dVar = new d9d(j, new ArrayList(list2.subList(i3, Math.min(size, i4))));
                    if (!z) {
                        if (charSequence != null) {
                            try {
                                string = charSequence.toString();
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                hm9.p("zm8", "splitMedias: Exception after split medias for send", th);
                                i3 = i4;
                            }
                        } else {
                            string = null;
                        }
                        d9dVar.m = string;
                        d9dVar.n = listB;
                        d9dVar.b = bw8Var;
                        z = true;
                    }
                    linkedList.add(new e9d(d9dVar));
                } catch (Throwable th2) {
                    th = th2;
                }
                i3 = i4;
            }
        }
        xb6 xb6Var = (xb6) p5dVar.d.getValue();
        this.X = linkedList;
        i = 2;
        this.Y = 2;
        objB = xb6Var.b(this.x0, this);
        tx3 tx3Var3 = tx3Var;
        if (objB == tx3Var3) {
            return tx3Var3;
        }
        linkedList.addAll((List) objB);
        ((s8g) p5dVar.b.getValue()).a(new h9d(new h8d(j, linkedList, i)));
        return e5f.a;
    }
}

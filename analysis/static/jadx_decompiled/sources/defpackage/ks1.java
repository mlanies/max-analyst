package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final class ks1 implements qu7 {
    public final zi5 A0;
    public final av0 B0;
    public final m7b C0;
    public final zu8 D0;
    public long Z;
    public boolean a;
    public volatile boolean b;
    public volatile js1 c;
    public long s0;
    public long t0;
    public final iba u0;
    public final tp7 v0;
    public final pk w0;
    public final au8 x0;
    public final p82 y0;
    public final ztc z0;
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    public final HashSet X = new HashSet();
    public final HashSet Y = new HashSet();

    public ks1(pk pkVar, au8 au8Var, p82 p82Var, ztc ztcVar, zi5 zi5Var, av0 av0Var, m7b m7bVar, iba ibaVar, tp7 tp7Var, zu8 zu8Var) {
        this.w0 = pkVar;
        this.x0 = au8Var;
        this.y0 = p82Var;
        this.z0 = ztcVar;
        this.A0 = zi5Var;
        this.B0 = av0Var;
        this.C0 = m7bVar;
        this.u0 = ibaVar;
        this.v0 = tp7Var;
        this.D0 = zu8Var;
    }

    @Override // defpackage.qu7
    public final void a() {
        g(new is1(this, 0));
    }

    public final void b(int i, List list) {
        HashSet hashSet;
        int size = list.size();
        while (true) {
            size--;
            hashSet = this.X;
            if (size < 0) {
                break;
            } else if (hashSet.contains(Long.valueOf(((es8) list.get(size)).a.b))) {
                list.remove(size);
            }
        }
        this.o.addAll(i, list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Long.valueOf(((es8) it.next()).a.b));
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        hashSet.addAll(arrayList);
    }

    public final void c() {
        if (this.t0 != 0 || this.c.Y.b() <= 0) {
            return;
        }
        for (Long l : ((LinkedHashMap) this.c.Y.a).keySet()) {
            if (this.y0.z(l.longValue()) != null) {
                List listSubList = (List) ((LinkedHashMap) this.c.Y.a).get(l);
                if (listSubList != null && !listSubList.isEmpty()) {
                    if (listSubList.size() > 100) {
                        listSubList = listSubList.subList(0, 100);
                    }
                    hm9.n("ks1", "loadMissedMessages: for chat: " + l + " messages size: " + listSubList.size());
                    this.t0 = ((k4a) this.w0).D(l.longValue(), new ArrayList(listSubList));
                    return;
                }
            } else {
                hm9.n("ks1", "loadMissedMessages: chat not found: " + l);
            }
        }
    }

    public final void d() {
        if (this.s0 == 0) {
            hm9.n("ks1", "loadNext: loading from network from: " + this.c.c + " backward");
            k4a k4aVar = (k4a) this.w0;
            this.s0 = k4a.v(k4aVar, new tdf(((p7b) k4aVar.y()).a.o(), this.c.c, false));
        }
    }

    public final void e() {
        if (this.c != null) {
            return;
        }
        this.c = new js1();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(((kk5) this.A0).b(), "call_history_state"));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            s5c.t(fileInputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            s5c.n(fileInputStream);
            s5c.m(byteArrayOutputStream);
            Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
            qw8.mergeFrom(callHistoryState, byteArray);
            this.c.a = b.i(callHistoryState.chunk);
            this.c.b = callHistoryState.forwardMarker;
            this.c.c = callHistoryState.backwardMarker;
            this.c.o = callHistoryState.hasNext;
            this.c.X = callHistoryState.hasPrev;
            Map<Long, Protos.CallHistoryState.MissedMessagesItem> map = callHistoryState.missedMessagesIds;
            if (map != null) {
                for (Map.Entry<Long, Protos.CallHistoryState.MissedMessagesItem> entry : map.entrySet()) {
                    jc7 jc7Var = this.c.Y;
                    Long key = entry.getKey();
                    ArrayList arrayListI = nd7.i(entry.getValue().ids);
                    LinkedHashMap linkedHashMap = (LinkedHashMap) jc7Var.a;
                    List list = (List) linkedHashMap.get(key);
                    if (list != null) {
                        list.addAll(arrayListI);
                    } else {
                        linkedHashMap.put(key, arrayListI);
                    }
                }
            }
        } catch (Exception e) {
            hm9.n("ks1", "loadState error, set default state " + e.getMessage());
        }
    }

    public final void f() {
        this.z0.b(new is1(this, 2));
    }

    public final void g(Runnable runnable) {
        this.u0.c().execute(runnable);
    }

    public final void h() {
        Protos.CallHistoryState callHistoryState = new Protos.CallHistoryState();
        callHistoryState.chunk = b.j(this.c.a);
        callHistoryState.forwardMarker = this.c.b;
        callHistoryState.backwardMarker = this.c.c;
        callHistoryState.hasNext = this.c.o;
        callHistoryState.hasPrev = this.c.X;
        if (this.c.Y != null) {
            callHistoryState.missedMessagesIds = new HashMap();
            for (Long l : ((LinkedHashMap) this.c.Y.a).keySet()) {
                Protos.CallHistoryState.MissedMessagesItem missedMessagesItem = new Protos.CallHistoryState.MissedMessagesItem();
                missedMessagesItem.ids = nd7.j((List) ((LinkedHashMap) this.c.Y.a).get(l));
                callHistoryState.missedMessagesIds.put(l, missedMessagesItem);
            }
        }
        byte[] byteArray = qw8.toByteArray(callHistoryState);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(((kk5) this.A0).b(), "call_history_state"));
            fileOutputStream.write(byteArray);
            s5c.m(fileOutputStream);
        } catch (IOException e) {
            hm9.k0("ks1", null, "failed to save state: " + e.getMessage(), Arrays.copyOf(new Object[0], 0));
        }
    }

    public final void i() {
        p7b p7bVar = (p7b) this.C0;
        long j = p7bVar.a.g.getLong("user.callsLastSync", 0L);
        long jP = p7bVar.a.p();
        StringBuilder sbK = au1.k(j, "setCallsLastSync: from: ", " to: ");
        sbK.append(jP);
        hm9.n("ks1", sbK.toString());
        p7bVar.a.l("user.callsLastSync", Long.valueOf(jP));
    }

    @uae
    public void onEvent(vz2 vz2Var) {
        g(new c(this, 25, vz2Var));
    }

    @uae
    public void onEvent(vdf vdfVar) {
        g(new c(this, 21, vdfVar));
    }

    @uae
    public void onEvent(ut7 ut7Var) {
        g(new c(this, 23, ut7Var));
    }

    @uae
    public void onEvent(kz6 kz6Var) {
        g(new c(this, 22, kz6Var));
    }

    @uae
    public void onEvent(re9 re9Var) {
        g(new c(this, 26, re9Var));
    }

    @uae
    public void onEvent(af9 af9Var) {
        g(new c(this, 24, af9Var));
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        g(new c(this, 20, oi0Var));
    }

    @uae
    public void onEvent(ze9 ze9Var) {
        g(new c(this, 19, ze9Var));
    }
}

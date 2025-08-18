package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class m2e implements ol0, b66, qj3, b7b, qc7 {
    public final /* synthetic */ int a;

    public /* synthetic */ m2e(int i) {
        this.a = i;
    }

    @Override // defpackage.ol0
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((List) obj).addAll((List) obj2);
                break;
            default:
                ((ArrayList) obj).addAll((List) obj2);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        m28 m28Var = m28.a;
        switch (this.a) {
            case 2:
                return ((eu) obj).c;
            case 3:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(iz7.r((e2e) it.next()));
                }
                return arrayList;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
            default:
                q3e q3eVar = (q3e) obj;
                r3e r3eVar = new r3e();
                r3eVar.a = q3eVar.a;
                r3eVar.b = q3eVar.b;
                r3eVar.c = q3eVar.c;
                r3eVar.d = q3eVar.d;
                r3eVar.e = q3eVar.e;
                r3eVar.f = q3eVar.f;
                r3eVar.g = q3eVar.g;
                r3eVar.h = q3eVar.h;
                r3eVar.i = q3eVar.i;
                return r3eVar;
            case 6:
                return Long.valueOf(((j3e) obj).c);
            case 10:
                return ((p2e) obj).c;
            case 11:
                return iz7.r((e2e) obj);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((eu) obj).o;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                List list = (List) obj;
                return list.isEmpty() ? m28Var : f28.e((q3e) list.get(0));
            case 16:
                return Long.valueOf(((m3e) obj).a);
            case LangUtils.HASH_SEED /* 17 */:
                b4e b4eVar = (b4e) obj;
                b4eVar.getClass();
                return new sa3(2, new ia4(13, b4eVar));
            case 18:
                List list2 = (List) obj;
                return list2.isEmpty() ? m28Var : f28.e((q3e) list2.get(0));
            case 19:
                r3e r3eVar2 = (r3e) obj;
                long j = r3eVar2.a;
                k3e k3eVar = new k3e();
                k3eVar.a = j;
                k3eVar.b = r3eVar2.b;
                k3eVar.c = r3eVar2.c;
                k3eVar.d = r3eVar2.d;
                k3eVar.e = r3eVar2.e;
                k3eVar.f = r3eVar2.f;
                k3eVar.g = r3eVar2.g;
                k3eVar.h = r3eVar2.h;
                k3eVar.i = r3eVar2.i;
                return new q3e(k3eVar);
            case 20:
                List list3 = (List) obj;
                return list3.isEmpty() ? m28Var : f28.e(list3);
            case 21:
                return ((OneMeRoomDatabase) obj).R();
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        switch (this.a) {
            case 5:
                return ((h9c) obj).a == t9c.STICKER;
            case 26:
                return ((wua) obj).Y != 0;
            default:
                return fme.a(((Integer) obj).intValue());
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 4:
                hm9.p("o2e", "onStickersLoadedFromNetwork: write to stickers db failed", (Throwable) obj);
                break;
            case 7:
                hm9.p("o2e", "Can't update recents", (Throwable) obj);
                break;
            case 8:
                hm9.p("o2e", "load: failed", (Throwable) obj);
                break;
            case 9:
                hm9.p("o2e", "clear: failed to clear repository", (Throwable) obj);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                hm9.p("q2e", "createSticker: failed", (Throwable) obj);
                break;
            case 13:
                hm9.p("a4e", "clear: repository clear failed", (Throwable) obj);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                hm9.p("ede", "Got error during handling event", (Throwable) obj);
                break;
            case 25:
                hm9.p("ede", "loadBotCommands: exception", (Throwable) obj);
                break;
            case 27:
                hm9.k("fme", "retryWhenCommonError: connected");
                break;
            default:
                hm9.k("fme", "retryWhenCommonErrorObs: connected");
                break;
        }
    }
}

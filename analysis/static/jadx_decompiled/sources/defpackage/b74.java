package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class b74 implements km7, jm7, qj3, b66 {
    public final /* synthetic */ int a;

    public /* synthetic */ b74(int i) {
        this.a = i;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        hm9.p("ga4", "clear: failed to clear repository", (Throwable) obj);
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 28:
                ja4 ja4Var = (ja4) obj;
                ja4Var.getClass();
                return new sa3(2, new ia4(0, ja4Var));
            default:
                return ((OneMeRoomDatabase) obj).y();
        }
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((gd) obj).getClass();
                break;
            case 1:
                ((u65) obj).getClass();
                break;
            case 2:
                ((u65) obj).getClass();
                break;
            case 3:
                ((u65) obj).getClass();
                break;
            case 4:
                ((u65) obj).getClass();
                break;
            case 5:
                ((gd) obj).getClass();
                break;
            case 6:
                ((u65) obj).getClass();
                break;
            case 7:
                ((gd) obj).getClass();
                break;
            case 8:
                ((u65) obj).getClass();
                break;
            case 9:
                ((u65) obj).getClass();
                break;
            case 10:
                ((u65) obj).getClass();
                break;
            case 11:
                ((u65) obj).getClass();
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((u65) obj).getClass();
                break;
            case 13:
                ((u65) obj).getClass();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((gd) obj).getClass();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((gd) obj).getClass();
                break;
            case 16:
                ((u65) obj).getClass();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((gd) obj).getClass();
                break;
            case 18:
                ((u65) obj).getClass();
                break;
            case 19:
                ((gd) obj).getClass();
                break;
            case 20:
                ((u65) obj).getClass();
                break;
            case 21:
                ((gd) obj).getClass();
                break;
            case 22:
                ((u65) obj).getClass();
                break;
            case 23:
                ((gd) obj).getClass();
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((u65) obj).getClass();
                break;
            case 25:
                ((u65) obj).getClass();
                break;
            default:
                ((u65) obj).getClass();
                break;
        }
    }

    public /* synthetic */ b74(ed edVar, int i) {
        this.a = 4;
    }

    public /* synthetic */ b74(ed edVar, Object obj, int i) {
        this.a = i;
    }

    public /* synthetic */ b74(ed edVar, boolean z) {
        this.a = 9;
    }

    public /* synthetic */ b74(fd fdVar, yn7 yn7Var, pc8 pc8Var, int i) {
        this.a = i;
    }
}

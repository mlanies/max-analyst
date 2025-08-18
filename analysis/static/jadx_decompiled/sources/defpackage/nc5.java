package defpackage;

import android.database.Cursor;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class nc5 implements qj3, b66, fu3, b7b {
    public final /* synthetic */ int a;

    public /* synthetic */ nc5(int i) {
        this.a = i;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                hm9.p("sc5", "load: failed", (Throwable) obj);
                break;
            case 1:
                hm9.p("sc5", "onAssetsUpdate: failed to store fav sticker sets", (Throwable) obj);
                break;
            case 2:
                hm9.p("sc5", "setFavoriteStickerSetMoved: failed", (Throwable) obj);
                break;
            case 5:
                hm9.p("sc5", "clear: failed to clear fav stickers repository", (Throwable) obj);
                break;
            case 19:
                hm9.p("md5", "failed favorites obs", (Throwable) obj);
                break;
            case 20:
                hm9.m("md5", "on next favorite sticker ids to subject: %s", (List) obj);
                break;
            case 21:
                hm9.p("md5", "load stickers: failed", (Throwable) obj);
                break;
            case 22:
                hm9.p("md5", "clear: failed to clear repository", (Throwable) obj);
                break;
            default:
                hm9.p("jg5", "onEvent: UpdateMessageEvent: message deleted", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        final int i = 0;
        int i2 = 2;
        wa3 wa3Var = wa3.a;
        switch (this.a) {
            case 3:
                return new uqd(((wc5) obj).a(), new nc5(9), 0);
            case 4:
                return new qa3(((wc5) obj).a(), i2, new nc5(7));
            case 5:
            case 19:
            case 20:
            case 21:
            case 22:
            default:
                return ((es8) obj).a.z0.k(g20.u0);
            case 6:
                return ((xc5) obj).a;
            case 7:
                fd5 fd5Var = (fd5) obj;
                fd5Var.getClass();
                return new sa3(2, new ia4(2, fd5Var));
            case 8:
                return ((OneMeRoomDatabase) obj).A();
            case 9:
                final fd5 fd5Var2 = (fd5) obj;
                Objects.requireNonNull(fd5Var2);
                return new q1a(2, new Callable() { // from class: uc5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i3 = i;
                        fd5 fd5Var3 = fd5Var2;
                        switch (i3) {
                            case 0:
                                fd5Var3.getClass();
                                xlc xlcVarA = xlc.a(0, "SELECT COUNT(*) FROM favorite_sticker_sets");
                                ilc ilcVar = fd5Var3.a;
                                ilcVar.b();
                                Cursor cursorO = ilcVar.o(xlcVarA, null);
                                try {
                                    long j = cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
                                    cursorO.close();
                                    xlcVarA.n();
                                    return Long.valueOf(j);
                                } catch (Throwable th) {
                                    cursorO.close();
                                    xlcVarA.n();
                                    throw th;
                                }
                            default:
                                return fd5Var3.c();
                        }
                    }
                });
            case 10:
                final fd5 fd5Var3 = (fd5) obj;
                Objects.requireNonNull(fd5Var3);
                final int i3 = 1;
                return new q1a(2, new Callable() { // from class: uc5
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i32 = i3;
                        fd5 fd5Var32 = fd5Var3;
                        switch (i32) {
                            case 0:
                                fd5Var32.getClass();
                                xlc xlcVarA = xlc.a(0, "SELECT COUNT(*) FROM favorite_sticker_sets");
                                ilc ilcVar = fd5Var32.a;
                                ilcVar.b();
                                Cursor cursorO = ilcVar.o(xlcVarA, null);
                                try {
                                    long j = cursorO.moveToFirst() ? cursorO.getLong(0) : 0L;
                                    cursorO.close();
                                    xlcVarA.n();
                                    return Long.valueOf(j);
                                } catch (Throwable th) {
                                    cursorO.close();
                                    xlcVarA.n();
                                    throw th;
                                }
                            default:
                                return fd5Var32.c();
                        }
                    }
                });
            case 11:
                fd5 fd5Var4 = (fd5) obj;
                fd5Var4.getClass();
                uh uhVar = new uh(fd5Var4, 6, xlc.a(0, "SELECT id FROM favorite_sticker_sets ORDER BY `index` ASC"));
                return ngg.o((OneMeRoomDatabase) fd5Var4.a, new String[]{"favorite_sticker_sets"}, uhVar);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                gu guVar = (gu) obj;
                return new xc5(guVar.Y, guVar.o);
            case 13:
                return wa3Var;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return wa3Var;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return wa3Var;
            case 16:
                gu guVar2 = (gu) obj;
                return new gd5(guVar2.Y, guVar2.c);
            case LangUtils.HASH_SEED /* 17 */:
                return wa3Var;
            case 18:
                return wa3Var;
            case 23:
                return new ArrayList((List) obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((gd5) obj).a;
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        return ((gua) obj).a == 167;
    }

    @Override // defpackage.fu3
    public Object u(Task task) {
        switch (this.a) {
            case 25:
                return Integer.valueOf(HttpStatus.SC_FORBIDDEN);
            default:
                return -1;
        }
    }
}

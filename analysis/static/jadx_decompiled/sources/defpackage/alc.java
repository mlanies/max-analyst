package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class alc {
    public final ilc a;
    public final sh b;
    public final sh c;
    public final zkc d;
    public final zkc e;
    public final zkc f;
    public final zkc g;
    public final zkc h;
    public final p19 i;
    public final p19 j;

    public alc(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new sh(oneMeRoomDatabase, 20);
        this.c = new sh(oneMeRoomDatabase, 21);
        new ha4(oneMeRoomDatabase, 5);
        new zkc(oneMeRoomDatabase, 0);
        this.d = new zkc(oneMeRoomDatabase, 1);
        this.e = new zkc(oneMeRoomDatabase, 2);
        this.f = new zkc(oneMeRoomDatabase, 3);
        this.g = new zkc(oneMeRoomDatabase, 4);
        this.h = new zkc(oneMeRoomDatabase, 5);
        new p19(oneMeRoomDatabase, 25);
        this.i = new p19(oneMeRoomDatabase, 26);
        new p19(oneMeRoomDatabase, 27);
        this.j = new p19(oneMeRoomDatabase, 28);
        new p19(oneMeRoomDatabase, 29);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(defpackage.alc r24, java.lang.String r25, kotlin.coroutines.Continuation r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.a(alc, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(defpackage.alc r5, java.lang.String r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof defpackage.pkc
            if (r0 == 0) goto L13
            r0 = r7
            pkc r0 = (defpackage.pkc) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            pkc r0 = new pkc
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.od2.a0(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.String r6 = r0.X
            alc r5 = r0.o
            defpackage.od2.a0(r7)
            goto L52
        L3a:
            defpackage.od2.a0(r7)
            r0.o = r5
            r0.X = r6
            r0.s0 = r4
            wkc r7 = new wkc
            r2 = 0
            r7.<init>(r5, r6, r2)
            ilc r2 = r5.a
            java.lang.Object r7 = defpackage.ote.j(r2, r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r7 = 0
            r0.o = r7
            r0.X = r7
            r0.s0 = r3
            r5.getClass()
            wkc r7 = new wkc
            r2 = 1
            r7.<init>(r5, r6, r2)
            ilc r5 = r5.a
            java.lang.Object r5 = defpackage.ote.j(r5, r7, r0)
            if (r5 != r1) goto L6b
            return r1
        L6b:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.b(alc, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.alc r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.qkc
            if (r0 == 0) goto L13
            r0 = r6
            qkc r0 = (defpackage.qkc) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qkc r0 = new qkc
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.od2.a0(r6)
            goto L68
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            alc r5 = r0.o
            defpackage.od2.a0(r6)
            goto L51
        L38:
            defpackage.od2.a0(r6)
            r0.o = r5
            r0.Z = r4
            r5.getClass()
            vkc r6 = new vkc
            r2 = 0
            r6.<init>(r5, r2)
            ilc r2 = r5.a
            java.lang.Object r6 = defpackage.ote.j(r2, r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r6 = 0
            r0.o = r6
            r0.Z = r3
            r5.getClass()
            vkc r6 = new vkc
            r2 = 1
            r6.<init>(r5, r2)
            ilc r5 = r5.a
            java.lang.Object r5 = defpackage.ote.j(r5, r6, r0)
            if (r5 != r1) goto L68
            return r1
        L68:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.c(alc, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0161 -> B:36:0x0164). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object f(defpackage.alc r26, java.util.List r27, java.util.Set r28, kotlin.coroutines.Continuation r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.f(alc, java.util.List, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object g(defpackage.alc r22, java.lang.String r23, int r24, kotlin.coroutines.Continuation r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alc.g(alc, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object d(Continuation continuation) {
        xlc xlcVarA = xlc.a(0, "SELECT * FROM chat_folder");
        return ote.i(this.a, new CancellationSignal(), new ykc(this, xlcVarA, 1), continuation);
    }

    public final ArrayList e(String str) {
        xlc xlcVarA = xlc.a(1, "SELECT chatId FROM folder_and_chats WHERE folderId = ?");
        if (str == null) {
            xlcVarA.W(1);
        } else {
            xlcVarA.f(1, str);
        }
        ilc ilcVar = this.a;
        ilcVar.b();
        Cursor cursorO = ilcVar.o(xlcVarA, null);
        try {
            ArrayList arrayList = new ArrayList(cursorO.getCount());
            while (cursorO.moveToNext()) {
                arrayList.add(cursorO.isNull(0) ? null : Long.valueOf(cursorO.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorO.close();
            xlcVarA.n();
        }
    }
}

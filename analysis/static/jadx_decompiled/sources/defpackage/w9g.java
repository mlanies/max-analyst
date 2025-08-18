package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class w9g extends AsyncTask {
    public static String g;
    public static String h;
    public static String i;
    public static final Pattern j = Pattern.compile("(http|https)://(www\\.|m.|)youtube\\.com/watch\\?v=(.+?)( |\\z|&)");
    public static final Pattern k = Pattern.compile("(http|https)://(www\\.|)youtu.be/(.+?)( |\\z|&)");
    public static final Pattern l = Pattern.compile("var ytInitialPlayerResponse\\s*=\\s*(\\{.+?\\})\\s*;");
    public static final Pattern m = Pattern.compile("url=(.+?)(\\u0026|$)");
    public static final Pattern n = Pattern.compile("s=(.+?)(\\u0026|$)");
    public static final Pattern o = Pattern.compile("([{; =])([a-zA-Z$][a-zA-Z0-9$]{0,2})\\.([a-zA-Z$][a-zA-Z0-9$]{0,2})\\(");
    public static final Pattern p = Pattern.compile("([{; =])([a-zA-Z$_][a-zA-Z0-9$]{0,2})\\(");
    public static final Pattern q = Pattern.compile("\\\\/s\\\\/player\\\\/([^\"]+?)\\.js");
    public static final Pattern r = Pattern.compile("/s/player/([^\"]+?).js");
    public static final Pattern s = Pattern.compile("(?:\\b|[^a-zA-Z0-9$])([a-zA-Z0-9$]{2})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)");
    public static final SparseArray t;
    public final WeakReference a;
    public String b;
    public final String c;
    public volatile String d;
    public final ReentrantLock e;
    public final Condition f;

    static {
        SparseArray sparseArray = new SparseArray();
        t = sparseArray;
        sparseArray.put(17, new py5(17, 144, 24, 0, "3gp"));
        sparseArray.put(36, new py5(36, 240, 32, 0, "3gp"));
        sparseArray.put(5, new py5(5, 240, 64, 0, "flv"));
        sparseArray.put(43, new py5(43, 360, 128, 0, "webm"));
        sparseArray.put(18, new py5(18, 360, 96, 0, "mp4"));
        sparseArray.put(22, new py5(22, 720, 192, 0, "mp4"));
        sparseArray.put(160, new py5(160, 144, "mp4"));
        sparseArray.put(133, new py5(133, 240, "mp4"));
        sparseArray.put(134, new py5(134, 360, "mp4"));
        sparseArray.put(135, new py5(135, 480, "mp4"));
        sparseArray.put(136, new py5(136, 720, "mp4"));
        sparseArray.put(137, new py5(137, 1080, "mp4"));
        sparseArray.put(264, new py5(264, 1440, "mp4"));
        sparseArray.put(266, new py5(266, 2160, "mp4"));
        sparseArray.put(298, new py5(298, 720, (Object) null, "mp4"));
        sparseArray.put(299, new py5(299, 1080, (Object) null, "mp4"));
        sparseArray.put(140, new py5(140, "m4a", 128, 0));
        sparseArray.put(141, new py5(141, "m4a", 256, 0));
        sparseArray.put(256, new py5(256, "m4a", 192, 0));
        sparseArray.put(258, new py5(258, "m4a", 384, 0));
        sparseArray.put(278, new py5(278, 144, "webm"));
        sparseArray.put(242, new py5(242, 240, "webm"));
        sparseArray.put(243, new py5(243, 360, "webm"));
        sparseArray.put(244, new py5(244, 480, "webm"));
        sparseArray.put(247, new py5(247, 720, "webm"));
        sparseArray.put(248, new py5(248, 1080, "webm"));
        sparseArray.put(271, new py5(271, 1440, "webm"));
        sparseArray.put(313, new py5(313, 2160, "webm"));
        sparseArray.put(HttpStatus.SC_MOVED_TEMPORARILY, new py5(HttpStatus.SC_MOVED_TEMPORARILY, 720, (Object) null, "webm"));
        sparseArray.put(308, new py5(308, 1440, (Object) null, "webm"));
        sparseArray.put(HttpStatus.SC_SEE_OTHER, new py5(HttpStatus.SC_SEE_OTHER, 1080, (Object) null, "webm"));
        sparseArray.put(315, new py5(315, 2160, (Object) null, "webm"));
        sparseArray.put(171, new py5(171, "webm", 128, 0));
        sparseArray.put(249, new py5(249, "webm", 48, 0));
        sparseArray.put(250, new py5(250, "webm", 64, 0));
        sparseArray.put(251, new py5(251, "webm", 160, 0));
        sparseArray.put(91, new py5(91, 144, 48));
        sparseArray.put(92, new py5(92, 240, 48));
        sparseArray.put(93, new py5(93, 360, 128));
        sparseArray.put(94, new py5(94, 480, 128));
        sparseArray.put(95, new py5(95, 720, 256));
        sparseArray.put(96, new py5(96, 1080, 256));
    }

    public w9g(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.e = reentrantLock;
        this.f = reentrantLock.newCondition();
        this.a = new WeakReference(context);
        this.c = context.getCacheDir().getAbsolutePath();
    }

    public final void a(SparseArray sparseArray) {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(zr6.l(new StringBuilder(), h, " function decipher("));
        sb.append("){return ");
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            if (i2 < sparseArray.size() - 1) {
                sb.append(i);
                sb.append("('");
                sb.append((String) sparseArray.get(iKeyAt));
                sb.append("')+\"\\n\"+");
            } else {
                sb.append(i);
                sb.append("('");
                sb.append((String) sparseArray.get(iKeyAt));
                sb.append("')");
            }
        }
        sb.append("};decipher();");
        new Handler(Looper.getMainLooper()).post(new wi3(this, context, sb));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f1 A[Catch: all -> 0x02fa, LOOP:4: B:109:0x02eb->B:111:0x02f1, LOOP_END, TryCatch #15 {all -> 0x02fa, blocks: (B:108:0x02e6, B:109:0x02eb, B:111:0x02f1, B:114:0x02fe), top: B:264:0x02e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0574 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x02fe A[EDGE_INSN: B:286:0x02fe->B:114:0x02fe BREAK  A[LOOP:4: B:109:0x02eb->B:111:0x02f1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:312:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a3  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.BufferedWriter, java.io.Writer] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.BufferedWriter] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.SparseArray b() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w9g.b():android.util.SparseArray");
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        this.b = null;
        String str = ((String[]) objArr)[0];
        if (str == null) {
            return null;
        }
        Matcher matcher = j.matcher(str);
        if (matcher.find()) {
            this.b = matcher.group(3);
        } else {
            Matcher matcher2 = k.matcher(str);
            if (matcher2.find()) {
                this.b = matcher2.group(3);
            } else if (str.matches("\\p{Graph}+?")) {
                this.b = str;
            }
        }
        if (this.b == null) {
            return null;
        }
        try {
            return b();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
    }
}

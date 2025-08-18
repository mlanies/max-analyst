package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.rlottie.RLottie;
import one.me.rlottie.RLottieDrawable;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class vo0 {
    public static ThreadPoolExecutor A;
    public static int B;
    public static jn C;
    public static boolean w;
    public static final ConcurrentHashMap x = new ConcurrentHashMap();
    public static volatile boolean y;
    public static final int z;
    public final to0 a;
    public final int b;
    public final int c;
    public final AtomicInteger d = new AtomicInteger(0);
    public final ArrayList e;
    public final boolean f;
    public byte[] g;
    public final Object h;
    public int i;
    public boolean j;
    public volatile boolean k;
    public final int l;
    public final File m;
    public int n;
    public final AtomicBoolean o;
    public final re p;
    public volatile boolean q;
    public volatile boolean r;
    public volatile boolean s;
    public volatile boolean t;
    public RandomAccessFile u;
    public BitmapFactory.Options v;

    static {
        z = Math.max(Math.min(r0.d - 2, tu0.l.e), 1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0119 -> B:66:0x0145). Please report as a decompilation issue!!! */
    public vo0(File file, to0 to0Var, so0 so0Var, int i, int i2, boolean z2) throws IOException {
        RandomAccessFile randomAccessFile;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.h = new Object();
        this.o = new AtomicBoolean(false);
        this.p = new re(5, this);
        this.a = to0Var;
        this.b = i;
        this.c = i2;
        so0Var.getClass();
        this.l = 100;
        String name = file.getName();
        if (A == null) {
            int i3 = z;
            A = new ThreadPoolExecutor(i3, i3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        File file2 = new File(tu0.l.c.u(), "acache");
        if (!w) {
            file2.mkdir();
            w = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        File file3 = new File(file2, zr6.l(sb, z2 ? "_nolimit" : " ", ".pcache2"));
        this.m = file3;
        this.f = i < he.a(60.0f) && i2 < he.a(60.0f);
        if (!((Boolean) tu0.l.g.invoke()).booleanValue()) {
            this.k = false;
            this.s = false;
            return;
        }
        this.k = file3.exists();
        if (this.k) {
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    randomAccessFile = new RandomAccessFile(file3, "r");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    this.s = randomAccessFile.readBoolean();
                    if (this.s && arrayList.isEmpty()) {
                        randomAccessFile.seek(randomAccessFile.readInt());
                        int i4 = randomAccessFile.readInt();
                        d(randomAccessFile, i4 > 10000 ? 0 : i4);
                        if (arrayList.size() == 0) {
                            this.s = false;
                            this.k = false;
                            this.q = true;
                            file3.delete();
                        } else {
                            if (this.u != randomAccessFile) {
                                a();
                            }
                            this.u = randomAccessFile;
                        }
                    }
                    if (this.u != randomAccessFile) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    try {
                        th.printStackTrace();
                        this.m.delete();
                        this.k = false;
                        this.q = true;
                        if (this.u != randomAccessFile2 && randomAccessFile2 != null) {
                            randomAccessFile2.close();
                        }
                        this.q = true;
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        this.q = true;
    }

    public static void c() {
        int i = B - 1;
        B = i;
        if (i <= 0) {
            B = 0;
            RLottieDrawable.lottieCacheGenerateQueue.b(new kc(3));
        }
    }

    public final void a() throws IOException {
        RandomAccessFile randomAccessFile = this.u;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01fc, code lost:
    
        r0 = r22[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01fe, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0200, code lost:
    
        r0.await();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0204, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0206, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0213, code lost:
    
        r15.close();
        r25.a.releaseForGenerateCache();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
    
        r12 = r6;
        r22 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01eb, code lost:
    
        one.me.rlottie.RLottie.getLogger().i("cancelled cache generation");
        r12.set(true);
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fa, code lost:
    
        if (r13 >= defpackage.vo0.z) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098 A[Catch: all -> 0x005d, IOException -> 0x0060, FileNotFoundException -> 0x0063, TryCatch #14 {FileNotFoundException -> 0x0063, IOException -> 0x0060, blocks: (B:3:0x0002, B:19:0x0050, B:34:0x0075, B:39:0x0082, B:43:0x008b, B:45:0x0098, B:46:0x00a1, B:47:0x00d5, B:49:0x00d9, B:54:0x00e2, B:56:0x00ea, B:59:0x00f5, B:62:0x0100, B:64:0x0104, B:66:0x0108, B:71:0x0111, B:70:0x010e, B:72:0x0114, B:73:0x0125, B:75:0x0128, B:76:0x0129, B:77:0x0133, B:79:0x0139, B:80:0x0156, B:81:0x0163, B:83:0x0166, B:84:0x0167, B:88:0x019b, B:91:0x019e, B:92:0x019f, B:96:0x01d8, B:97:0x01eb, B:98:0x01f8, B:100:0x01fc, B:102:0x0200, B:107:0x0209, B:106:0x0206, B:111:0x0213, B:53:0x00df), top: B:145:0x0002, outer: #13 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo0.b():void");
    }

    public final void d(RandomAccessFile randomAccessFile, int i) throws IOException {
        if (i == 0) {
            return;
        }
        byte[] bArr = new byte[i * 8];
        randomAccessFile.read(bArr);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        for (int i2 = 0; i2 < i; i2++) {
            uo0 uo0Var = new uo0(i2);
            uo0Var.c = byteBufferWrap.getInt();
            uo0Var.b = byteBufferWrap.getInt();
            this.e.add(uo0Var);
        }
    }

    public final byte[] e(uo0 uo0Var) {
        boolean z2 = this.f && Thread.currentThread().getName().startsWith("rlottie-bg-pool");
        byte[] bArr = z2 ? (byte[]) x.get(Thread.currentThread()) : this.g;
        if (bArr == null || bArr.length < uo0Var.b) {
            bArr = new byte[(int) (uo0Var.b * 1.3f)];
            if (z2) {
                x.put(Thread.currentThread(), bArr);
                if (!y) {
                    y = true;
                    he.e(this.p, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                }
            } else {
                this.g = bArr;
            }
        }
        return bArr;
    }

    public final int f(Bitmap bitmap, int i) throws IOException {
        RandomAccessFile randomAccessFile;
        if (this.j) {
            return -1;
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            if (!this.s && !this.k) {
                return -1;
            }
            if (!this.s || (randomAccessFile = this.u) == null) {
                randomAccessFile = new RandomAccessFile(this.m, "r");
                try {
                    this.s = randomAccessFile.readBoolean();
                    if (this.s && this.e.isEmpty()) {
                        randomAccessFile.seek(randomAccessFile.readInt());
                        d(randomAccessFile, randomAccessFile.readInt());
                    }
                    if (this.e.size() == 0) {
                        this.s = false;
                        this.q = true;
                    }
                    if (!this.s) {
                        randomAccessFile.close();
                        return -1;
                    }
                } catch (FileNotFoundException unused) {
                    randomAccessFile2 = randomAccessFile;
                    if (this.j && randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return -1;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile2 = randomAccessFile;
                    RLottie.getLogger().o(th);
                    int i2 = this.n + 1;
                    this.n = i2;
                    if (i2 > 10) {
                        this.j = true;
                    }
                    if (this.j) {
                        randomAccessFile2.close();
                    }
                    return -1;
                }
            }
            if (this.e.size() == 0) {
                return -1;
            }
            uo0 uo0Var = (uo0) this.e.get(Math.max(Math.min(i, this.e.size() - 1), 0));
            randomAccessFile.seek(uo0Var.c);
            byte[] bArrE = e(uo0Var);
            randomAccessFile.readFully(bArrE, 0, uo0Var.b);
            if (this.t) {
                this.u = null;
                randomAccessFile.close();
            } else {
                if (this.u != randomAccessFile) {
                    a();
                }
                this.u = randomAccessFile;
            }
            if (this.v == null) {
                this.v = new BitmapFactory.Options();
            }
            BitmapFactory.Options options = this.v;
            options.inBitmap = bitmap;
            BitmapFactory.decodeByteArray(bArrE, 0, uo0Var.b, options);
            this.v.inBitmap = null;
            return 0;
        } catch (FileNotFoundException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean g() {
        return (this.s && this.k) ? false : true;
    }
}

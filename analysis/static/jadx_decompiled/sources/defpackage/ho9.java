package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.FileSystemException;
import kotlin.io.NoSuchFileException;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes.dex */
public final class ho9 implements vuc {
    public static ho9 e;
    public int a;
    public Object b;
    public Object c;
    public Object d;

    public ho9(Context context) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new an(9, this), intentFilter);
    }

    public static void g(int i, ho9 ho9Var) {
        synchronized (ho9Var.d) {
            try {
                if (ho9Var.a == i) {
                    return;
                }
                ho9Var.a = i;
                Iterator it = ((CopyOnWriteArrayList) ho9Var.c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    g84 g84Var = (g84) weakReference.get();
                    if (g84Var != null) {
                        g84Var.a(i);
                    } else {
                        ((CopyOnWriteArrayList) ho9Var.c).remove(weakReference);
                    }
                }
            } finally {
            }
        }
    }

    public static synchronized ho9 h(Context context) {
        try {
            if (e == null) {
                e = new ho9(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    @Override // defpackage.vuc
    public int a() {
        return this.a;
    }

    @Override // defpackage.vuc
    public void b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri, "w");
        if (outputStreamOpenOutputStream == null) {
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream((File) this.b);
            try {
                byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                for (int i = fileInputStream.read(bArr); i > 0; i = fileInputStream.read(bArr)) {
                    outputStreamOpenOutputStream.write(bArr, 0, i);
                }
                v3c.i(fileInputStream, null);
                v3c.i(outputStreamOpenOutputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                v3c.i(outputStreamOpenOutputStream, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.vuc
    public Uri c() {
        return (Uri) this.d;
    }

    @Override // defpackage.vuc
    public String d() {
        return (String) this.c;
    }

    @Override // defpackage.vuc
    public Integer e() {
        return null;
    }

    @Override // defpackage.vuc
    public void f(File file) throws FileSystemException {
        File file2 = (File) this.b;
        if (!file2.exists()) {
            throw new NoSuchFileException(file2, null, "The source file doesn't exist.");
        }
        if (file.exists() && !file.delete()) {
            throw new FileAlreadyExistsException(file2, file, "Tried to overwrite the destination, but failed to delete it.");
        }
        if (file2.isDirectory()) {
            if (!file.mkdirs()) {
                throw new FileSystemException(file2, file, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ema.l(fileInputStream, fileOutputStream, 8192);
                v3c.i(fileOutputStream, null);
                v3c.i(fileInputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                v3c.i(fileInputStream, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.vuc
    public Integer getHeight() {
        return null;
    }

    @Override // defpackage.vuc
    public Integer getWidth() {
        return null;
    }

    public int i() {
        int i;
        synchronized (this.d) {
            i = this.a;
        }
        return i;
    }

    public int j() {
        int i = this.a;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public ho9(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.b = str;
        this.a = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.c = listUnmodifiableList;
        this.d = bArr;
    }

    public ho9() {
        this.a = 20;
    }

    public ho9(RLottieDrawable rLottieDrawable) {
        this.d = rLottieDrawable;
    }
}

package defpackage;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* loaded from: classes.dex */
public abstract class d65 {
    public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) throws ErrnoException {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j, int i) throws ErrnoException {
        return Os.lseek(fileDescriptor, j, i);
    }
}

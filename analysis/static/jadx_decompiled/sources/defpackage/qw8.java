package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class qw8 {
    protected volatile int cachedSize = -1;

    public static final <T extends qw8> T mergeFrom(T t, byte[] bArr, int i, int i2) throws InvalidProtocolBufferNanoException {
        try {
            x43 x43Var = new x43(bArr, i, i2);
            t.mergeFrom(x43Var);
            x43Var.a(0);
            return t;
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public static final boolean messageNanoEquals(qw8 qw8Var, qw8 qw8Var2) {
        int serializedSize;
        if (qw8Var == qw8Var2) {
            return true;
        }
        if (qw8Var == null || qw8Var2 == null || qw8Var.getClass() != qw8Var2.getClass() || qw8Var2.getSerializedSize() != (serializedSize = qw8Var.getSerializedSize())) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(qw8Var, bArr, 0, serializedSize);
        toByteArray(qw8Var2, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void toByteArray(qw8 qw8Var, byte[] bArr, int i, int i2) {
        try {
            y43 y43Var = new y43(bArr, i, i2);
            qw8Var.writeTo(y43Var);
            if (y43Var.a.remaining() == 0) {
            } else {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract int computeSerializedSize();

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int iComputeSerializedSize = computeSerializedSize();
        this.cachedSize = iComputeSerializedSize;
        return iComputeSerializedSize;
    }

    public abstract qw8 mergeFrom(x43 x43Var);

    public String toString() throws SecurityException, IllegalArgumentException {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            s5c.W(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            return "Error printing proto: " + e.getMessage();
        } catch (InvocationTargetException e2) {
            return "Error printing proto: " + e2.getMessage();
        }
    }

    public abstract void writeTo(y43 y43Var);

    public qw8 clone() throws CloneNotSupportedException {
        return (qw8) super.clone();
    }

    public static final <T extends qw8> T mergeFrom(T t, byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T) mergeFrom(t, bArr, 0, bArr.length);
    }

    public static final byte[] toByteArray(qw8 qw8Var) {
        int serializedSize = qw8Var.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(qw8Var, bArr, 0, serializedSize);
        return bArr;
    }
}

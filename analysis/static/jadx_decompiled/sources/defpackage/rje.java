package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rje extends ffe implements a66 {
    public Closeable X;
    public aab Y;
    public FileChannel Z;
    public mec s0;
    public ByteBuffer t0;
    public long u0;
    public int v0;
    public int w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ aab y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rje(aab aabVar, Continuation continuation) {
        super(2, continuation);
        this.y0 = aabVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rje) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rje rjeVar = new rje(this.y0, continuation);
        rjeVar.x0 = obj;
        return rjeVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:36|(3:41|42|(3:52|28|(3:30|(2:32|34)(2:33|82)|(0)(0))(4:53|(5:55|76|56|59|(1:61)(2:62|63))|64|65))(0))|43|74|44|47|(1:49)(4:50|51|42|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010b, code lost:
    
        r4 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[Catch: all -> 0x004e, TryCatch #3 {all -> 0x004e, blocks: (B:15:0x003e, B:36:0x00d3, B:43:0x00ec, B:44:0x00fe, B:47:0x010d, B:52:0x012a, B:30:0x008f, B:34:0x009e, B:53:0x014f, B:55:0x015b, B:56:0x0162, B:59:0x0171, B:22:0x006f, B:27:0x007f), top: B:78:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3 A[Catch: all -> 0x004e, TryCatch #3 {all -> 0x004e, blocks: (B:15:0x003e, B:36:0x00d3, B:43:0x00ec, B:44:0x00fe, B:47:0x010d, B:52:0x012a, B:30:0x008f, B:34:0x009e, B:53:0x014f, B:55:0x015b, B:56:0x0162, B:59:0x0171, B:22:0x006f, B:27:0x007f), top: B:78:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a A[Catch: all -> 0x004e, TryCatch #3 {all -> 0x004e, blocks: (B:15:0x003e, B:36:0x00d3, B:43:0x00ec, B:44:0x00fe, B:47:0x010d, B:52:0x012a, B:30:0x008f, B:34:0x009e, B:53:0x014f, B:55:0x015b, B:56:0x0162, B:59:0x0171, B:22:0x006f, B:27:0x007f), top: B:78:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f A[Catch: all -> 0x004e, TryCatch #3 {all -> 0x004e, blocks: (B:15:0x003e, B:36:0x00d3, B:43:0x00ec, B:44:0x00fe, B:47:0x010d, B:52:0x012a, B:30:0x008f, B:34:0x009e, B:53:0x014f, B:55:0x015b, B:56:0x0162, B:59:0x0171, B:22:0x006f, B:27:0x007f), top: B:78:0x000f }] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00e7 -> B:42:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0127 -> B:51:0x0128). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rje.o(java.lang.Object):java.lang.Object");
    }
}

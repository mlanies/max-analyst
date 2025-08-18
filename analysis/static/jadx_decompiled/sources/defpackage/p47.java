package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class p47 {
    public static q47 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.InvalidateAndDownloadAudio invalidateAndDownloadAudio = (Tasks.InvalidateAndDownloadAudio) qw8.mergeFrom(new Tasks.InvalidateAndDownloadAudio(), bArr);
            one oneVar = new one();
            Tasks.FileDownload fileDownload = invalidateAndDownloadAudio.fileDownload;
            oneVar.a = fileDownload.messageId;
            oneVar.b = fileDownload.attachId;
            oneVar.c = fileDownload.videoId;
            oneVar.d = fileDownload.audioId;
            oneVar.e = fileDownload.mp4GifId;
            oneVar.f = fileDownload.stickerId;
            oneVar.j = fileDownload.fileId;
            oneVar.k = fileDownload.fileName;
            oneVar.g = fileDownload.url;
            oneVar.h = fileDownload.notifyProgress;
            oneVar.i = fileDownload.checkAutoloadConnection;
            oneVar.l = fileDownload.invalidateCount;
            oneVar.m = fileDownload.useOriginalExtension;
            oneVar.n = fileDownload.notCopyVideoToGallery;
            return new q47(invalidateAndDownloadAudio.requestId, invalidateAndDownloadAudio.outputPath, invalidateAndDownloadAudio.chatServerId, invalidateAndDownloadAudio.serverMessageId, new pne(oneVar));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}

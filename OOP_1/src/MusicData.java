public class MusicData implements IToStringParsable
{
    private String songName;
    private int songCopiesSold;
    private boolean isDownloadable;

    public MusicData(String songName, int songCopiesSold)
    {
        this.songName = songName;
        this.songCopiesSold = songCopiesSold;
        this.isDownloadable = true;
    }
    
    public MusicData(String songName, int songCopiesSold, boolean isDownloadable)
    {
        this.songName = songName;
        this.songCopiesSold = songCopiesSold;
        this.isDownloadable = isDownloadable;
    }
    
    //region GETTERS_SETTERS
    
    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setSongCopiesSold(int songCopiesSold) {
        this.songCopiesSold = songCopiesSold;
    }

    public void setDownloadable(boolean downloadable) {
        isDownloadable = downloadable;
    }

    public String getSongName() {
        return songName;
    }

    public int getSongCopiesSold() {
        return songCopiesSold;
    }

    public boolean isDownloadable() {
        return isDownloadable;
    }
    
    //endregion
    
    public String Parse()
    {
        var builder = new StringBuilder();

        builder.append("Song name:\t");
        builder.append(songName);
        builder.append(System.lineSeparator());
        
        builder.append("Copies sold:\t");
        builder.append(songCopiesSold);
        builder.append(System.lineSeparator());
        
        builder.append("Is downloadable:\t");
        builder.append(isDownloadable ? "true" : "false");
        builder.append(System.lineSeparator());
        
        return builder.toString();
    }
    
    public void OutPutSongData()
    {
        System.out.println(Parse());
    }
}

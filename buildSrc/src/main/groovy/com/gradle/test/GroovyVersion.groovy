class GroovyVersion{
    def major
    def minor

    @Override
    String toString() {
        return "version ${major}-${minor}"
    }
}
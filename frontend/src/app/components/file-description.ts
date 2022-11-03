export class FileDescription {
  id: number;
  originalFilename: string;
  generatedFilename: string;

  constructor(id: number, originalFilename: string, generatedFilename: string) {
    this.id = id;
    this.originalFilename = originalFilename;
    this.generatedFilename = generatedFilename;
  }
}
